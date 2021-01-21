package com.once.enterpoint;

import cn.hutool.core.lang.Assert;
import com.once.config.Config;

import java.util.List;
import java.util.stream.Collectors;

/***
 * 默认Resolver
 * @author once
 * @date 2021/1/20 20:28
 *
 */
public class DefaultEnterPointResolver implements EnterpointResolver {

    private List<AbstractEnterPoint> enterpointList;

    @Override
    public Enterpoint resolve(final Config resource) {
        List<AbstractEnterPoint> enterpoints = enterpointList.stream().filter(e -> e.support(resource)).collect(Collectors.toList());
        Assert.isFalse(enterpoints.size() != 1,"enter point is not only");
        return enterpoints.get(0);
    }

}
