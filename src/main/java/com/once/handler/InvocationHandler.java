package com.once.handler;

/**
 * @author Zhang Bo
 * @date 2021/1/21 10:59
 */
public abstract class InvocationHandler implements Handler {

    protected Handler invoker;

    public void setTarget(Handler target) {
        this.invoker = target;
    }

    @Override
    public Object handler(Object obj) {
        return handler(obj,invoker);
    }

    abstract Object handler(Object obj, Handler invoker);
}
