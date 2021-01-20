package com.once.enterpoint;

import com.once.config.ConfigSupport;
import com.once.handler.Handler;

/***
 * 业务入口点
 * @author once
 * @date 2021/1/20 20:10
 *
 */
public interface Enterpoint extends ConfigSupport {


    Object enter(Object o);

    void handler(Handler handler);

}
