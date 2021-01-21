package com.once.enterpoint;

import com.once.config.Config;

/***
 * TODO
 * @author once
 * @date 2021/1/20 20:18
 *
 */
public interface EnterpointResolver {

    Enterpoint resolve(Config resource);
}
