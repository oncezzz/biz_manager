package com.once.handler;

/**
 * @author Zhang Bo
 * @date 2021/1/21 14:49
 */
public class TestHandler extends InvocationHandler {
    @Override
    Object handler(Object obj, Handler invoker) {
        System.out.println("执行前" + this);
        Object o = null;
        if (invoker != null) {
            o = invoker.handler(obj);
        }
        System.out.println("执行后" + this);
        return o;
    }
}
