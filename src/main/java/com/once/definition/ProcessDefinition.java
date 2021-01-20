package com.once.definition;

import com.once.config.Config;
import com.once.config.ConfigSupport;
import com.once.config.ProcessDefinitionConfig;
import com.once.enterpoint.Enterpoint;

/***
 * TODO
 * @author once
 * @date 2021/1/20 22:36
 *
 */
public interface ProcessDefinition extends ConfigSupport {

    void joinPoint(Enterpoint enterpoint);

    Enterpoint resolver(ProcessDefinitionConfig config);
}
