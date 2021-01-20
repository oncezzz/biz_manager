package com.once.enterpoint;

import com.once.handler.Handler;
import com.once.handler.HandlerWrapper;

/***
 * 抽象层入口点
 * @author once
 * @date 2021/1/20 20:12
 *
 */
public abstract class AbstractEnterPoint implements Enterpoint {

    protected HandlerWrapper handlerWrapper;

    @Override
    public void handler(Handler handler) {
        this.handlerWrapper = new HandlerWrapper(handler).wrap(handlerWrapper);
    }
}
