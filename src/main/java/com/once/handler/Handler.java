package com.once.handler;

import java.lang.reflect.InvocationHandler;

/***
 * TODO
 * @author once
 * @date 2021/1/20 20:42
 *
 */
public interface Handler extends InvocationHandler {

    Object handler(Object obj,HandlerChain chain);

}
