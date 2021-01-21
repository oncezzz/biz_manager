package com.once.enterpoint;

import com.once.handler.DefaultHandlerChain;
import com.once.handler.Handler;
import com.once.handler.HandlerChain;
import com.once.handler.HandlerWrapper;

import java.util.ArrayList;
import java.util.List;

/***
 * 抽象层入口点
 * @author once
 * @date 2021/1/20 20:12
 *
 */
public abstract class AbstractEnterPoint implements Enterpoint {

    private List<Handler> handlers = new ArrayList<>();

    @Override
    public void handler(Handler handler) {
        handlers.add(handler);
    }

    protected Object doEnter(Object o) {
        DefaultHandlerChain handlerChain = new DefaultHandlerChain(handlers);
        return handlerChain.doHandler(o);
    }
}
