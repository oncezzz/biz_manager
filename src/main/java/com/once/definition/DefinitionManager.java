package com.once.definition;

import com.once.config.Config;

import java.util.ArrayList;
import java.util.List;

/***
 * 流程管理
 * @author once
 * @date 2021/1/20 23:10
 *
 */
public class DefinitionManager {

    private List<ProcessDefinition> definitions = new ArrayList<>();

    public void add(ProcessDefinition definition) {
        definitions.add(definition);
    }

    public Object execute(Config o) {
        return resolver(o).resolver(o).enter(o);
    }

    private ProcessDefinition resolver(Config config) {
        return definitions.stream().filter(d -> d.support(config)).findFirst().get();
    }
}
