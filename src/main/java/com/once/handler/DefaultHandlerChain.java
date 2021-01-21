package com.once.handler;

import java.util.List;

/***
 * TODO
 * @author once
 * @date 2021/1/21 23:15
 *
 */
public class DefaultHandlerChain implements HandlerChain {

    private Handler[] handlers;

    public DefaultHandlerChain(List<Handler> handlers) {
        this.handlers = new Handler[handlers.size()];
        this.handlers = handlers.toArray(this.handlers);
    }

    private int pos = 0;

    @Override
    public Object doHandler(Object o) {
        Handler handler = handlers[pos++];
        return handler.handler(o, this);
    }
}
