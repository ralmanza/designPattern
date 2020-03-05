package org.designpattern.exercise.conditionmaker;

import org.designpattern.exercise.directorybuilder.File;

public class EqualsExpression implements IExpression {

    private String value;

    public EqualsExpression(String value) {
        this.value = value;
    }

    @Override
    public boolean evaluate(File file) {
        return value.equals(file.getExtension());
    }
}
