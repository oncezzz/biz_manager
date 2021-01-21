package com.once.customizer;

import cn.hutool.core.lang.Assert;
import com.once.enterpoint.DefaultEnterPoint;
import com.once.enterpoint.Enterpoint;
import com.once.handler.Handler;

import java.util.Stack;

/***
 * 入口点定义器
 * @author once
 * @date 2021/1/20 21:17
 *
 */
public class EnterPointCustomizer {

    private Enterpoint enterpoint = new DefaultEnterPoint() ;

    private Stack<Handler> handlers = new Stack<>();

    public static EnterPointCustomizer builder() {
        return new EnterPointCustomizer();
    }

    public EnterPointCustomizer addHandler(Handler handler) {
        handlers.push(handler);
        return this;
    }

    public EnterPointCustomizer enterPoint(Enterpoint enterpoint) {
        this.enterpoint = enterpoint;
        return this;
    }

    public Enterpoint build() {
        Assert.notEmpty(handlers);
        handlers.forEach(enterpoint::handler);
        return enterpoint;
    }

}
