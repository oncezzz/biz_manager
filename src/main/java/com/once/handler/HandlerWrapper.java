package com.once.handler;

/***
 * TODO
 * @author once
 * @date 2021/1/20 20:55
 *
 */
public class HandlerWrapper{

    public static Handler wrap(Handler handler,InvocationHandler proxy) {
        proxy.setTarget(handler);
        return proxy;
    }
}
