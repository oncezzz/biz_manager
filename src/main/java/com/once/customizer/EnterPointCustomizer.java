package com.once.customizer;

import cn.hutool.core.lang.Assert;
import com.once.enterpoint.DefaultEnterPoint;
import com.once.enterpoint.Enterpoint;
import com.once.handler.Handler;

import java.util.ArrayList;
import java.util.List;

/***
 * 入口点定义器
 * @author once
 * @date 2021/1/20 21:17
 *
 */
public class EnterPointCustomizer {

    private Enterpoint enterpoint = new DefaultEnterPoint(null) ;

    private List<Handler> handlers = new ArrayList<>();

    public static EnterPointCustomizer builder() {
        return new EnterPointCustomizer();
    }

    EnterPointCustomizer addHandler(Handler handler) {
        handlers.add(handler);
        return this;
    }

    EnterPointCustomizer enterPoint(Enterpoint enterpoint) {
        this.enterpoint = enterpoint;
        return this;
    }

    Enterpoint build() {
        Assert.notEmpty(handlers);
        Assert.isNull(enterpoint);
        handlers.forEach(enterpoint::handler);
        return enterpoint;
    }

}
