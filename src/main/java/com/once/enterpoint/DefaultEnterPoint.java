package com.once.enterpoint;

import com.once.config.Config;
import com.once.handler.Handler;

/***
 * TODO
 * @author once
 * @date 2021/1/20 21:37
 *
 */
public class DefaultEnterPoint extends AbstractEnterPoint {

    @Override
    public Object enter(Object o) {
        return null;
    }

    @Override
    public void handler(Handler handler) {

    }

    @Override
    public boolean support(Config config) {
        return false;
    }
}
