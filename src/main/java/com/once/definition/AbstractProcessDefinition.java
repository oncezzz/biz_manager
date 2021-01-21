package com.once.definition;

import com.once.config.Config;
import com.once.enterpoint.Enterpoint;

import java.util.LinkedList;

/***
 * 默认流程处理器
 * @author once
 * @date 2021/1/20 22:39
 *
 */
public class AbstractProcessDefinition implements ProcessDefinition {

    private LinkedList<Enterpoint> enterpoints = new LinkedList<>();

    @Override
    public void joinPoint(Enterpoint enterpoint) {
        enterpoints.add(enterpoint);
    }

    @Override
    public Enterpoint resolver(Config config) {
        return enterpoints.stream().filter(e -> e.support(config)).findFirst().get();
    }

    @Override
     public boolean support(Config config) {
        return true;
    }
}
