package org.designpattern.exercise.conditionmaker;

import org.designpattern.exercise.directorybuilder.File;

public class ContainsExpression implements IExpression {

    private String value;

    public ContainsExpression(String value) {
        this.value = value;
    }

    @Override
    public boolean evaluate(File file) {
        return file.getName().toLowerCase().contains(value.toLowerCase());
    }
}
