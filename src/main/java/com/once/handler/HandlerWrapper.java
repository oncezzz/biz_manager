package com.once.handler;

import org.omg.PortableInterceptor.Interceptor;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/***
 * TODO
 * @author once
 * @date 2021/1/20 20:55
 *
 */
public class HandlerWrapper implements Handler {

    private Object target;

    private Handler handler;



    public HandlerWrapper wrap(Handler handler) {
        if (this.handler == null) {
            this.handler = handler;
            return this;
        }
        return (HandlerWrapper)Proxy.newProxyInstance(handler.getClass().getClassLoader(), handler.getClass().getInterfaces(),this);
    }

    @Override
    public Object handler(Object obj) {
        return handler.handler(obj);
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Invocation invocation = new Invocation(target,method,args);
        return invocation.process();
    }

    public static void main(String[] args) {
        HandlerWrapper handlerWrapper1 = new HandlerWrapper();
        HandlerWrapper handlerWrapper2 = new HandlerWrapper();
        HandlerWrapper handlerWrapper3 = new HandlerWrapper();
        HandlerWrapper wrap = handlerWrapper1.wrap(handlerWrapper2).wrap(handlerWrapper3);
        System.out.println(wrap);
    }
}
