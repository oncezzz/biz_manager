package com.once.handler;

/***
 * TODO
 * @author once
 * @date 2021/1/20 20:55
 *
 */
public class HandlerWrapper implements Handler {

    private Handler handler;

    public HandlerWrapper(Handler handler) {
        this.handler = handler;
    }

    public HandlerWrapper wrap(Handler handler) {
        this.handler = handler;
        return this;
    }

    @Override
    public Object handler(Object obj) {
        return handler.handler(obj);
    }

}
