package com.once.handler;

import com.once.config.ProcessDefinitionConfig;
import com.once.customizer.EnterPointCustomizer;
import com.once.customizer.ProcessDefinitionCustomizer;
import com.once.definition.ProcessDefinition;
import com.once.enterpoint.Enterpoint;

/**
 * @author Zhang Bo
 * @date 2021/1/21 11:36
 */
public class Tesa {
    public static void main(String[] args) {
        ProcessDefinition definition = ProcessDefinitionCustomizer.builder().joinPoint(() ->
                EnterPointCustomizer.builder().addHandler(new TestHandler()).addHandler(new TestHandler()).build()
        ).joinPoint(() ->
                EnterPointCustomizer.builder().addHandler(new TestHandler()).addHandler(new TestHandler()).build()
        ).build();
        Enterpoint enterpoint = definition.resolver(new ProcessDefinitionConfig());
        enterpoint.enter("123");
    }
}
