package com.once.customizer;

import cn.hutool.core.lang.Assert;
import com.once.definition.DefaultProcessDefinition;
import com.once.definition.ProcessDefinition;
import com.once.enterpoint.Enterpoint;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/***
 * 流程定义器
 * @author once
 * @date 2021/1/20 21:28
 *
 */
public class ProcessDefinitionCustomizer {

    private List<Enterpoint> enterPoints = new ArrayList<>();

    private ProcessDefinition processDefinition = new DefaultProcessDefinition();

    public static ProcessDefinitionCustomizer builder() {
        return new ProcessDefinitionCustomizer();
    }

    public ProcessDefinitionCustomizer joinPoint(Supplier<Enterpoint> supplier) {
        enterPoints.add(supplier.get());
        return this;
    }

    public ProcessDefinitionCustomizer definition(ProcessDefinition definition) {
        this.processDefinition = definition;
        return this;
    }

   public ProcessDefinition build() {
        Assert.notEmpty(enterPoints);
        enterPoints.forEach(processDefinition::joinPoint);
        return processDefinition;
    }

}
