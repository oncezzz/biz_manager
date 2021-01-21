package com.once.enterpoint;

import com.once.handler.Handler;
import com.once.handler.HandlerWrapper;
import com.once.handler.InvocationHandler;

/***
 * 抽象层入口点
 * @author once
 * @date 2021/1/20 20:12
 *
 */
public abstract class AbstractEnterPoint implements Enterpoint {

    protected Handler handler;

    @Override
    public void handler(Handler handler) {
        if (this.handler == null) {
            this.handler = handler;
        }else {
            if (this.handler instanceof InvocationHandler) {
                this.handler = HandlerWrapper.wrap(handler, (InvocationHandler) this.handler);
            }
        }

    }
}
