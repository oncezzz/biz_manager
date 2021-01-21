package com.once.enterpoint;

import com.once.config.Config;

/***
 * TODO
 * @author once
 * @date 2021/1/20 21:37
 *
 */
public class DefaultEnterPoint extends AbstractEnterPoint {

    @Override
    public Object enter(Object o) {
        System.out.println("入口点进入start");
        Object rs = this.handler.handler(o);
        System.out.println("入口点进入end");
        return rs;
    }

    @Override
    public boolean support(Config config) {
        return true;
    }
}
