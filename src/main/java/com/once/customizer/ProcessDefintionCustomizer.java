package com.once.customizer;

import cn.hutool.core.lang.Assert;
import com.once.definition.DefaultProcessDefinition;
import com.once.definition.ProcessDefinition;
import com.once.enterpoint.Enterpoint;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/***
 * 流程定义器
 * @author once
 * @date 2021/1/20 21:28
 *
 */
public class ProcessDefintionCustomizer {

    private List<Enterpoint> enterPoints = new ArrayList<>();

    private ProcessDefinition processDefinition = new DefaultProcessDefinition();

    private static ProcessDefintionCustomizer builder() {
        return new ProcessDefintionCustomizer();
    }

    ProcessDefintionCustomizer joinPoint(Supplier<Enterpoint> supplier) {
        enterPoints.add(supplier.get());
        return this;
    }

    ProcessDefintionCustomizer definition(ProcessDefinition definition) {
        this.processDefinition = definition;
        return this;
    }

   public ProcessDefinition build() {
        Assert.notEmpty(enterPoints);
        Assert.isNull(processDefinition);
        enterPoints.forEach(processDefinition::joinPoint);
        return processDefinition;
    }

}
