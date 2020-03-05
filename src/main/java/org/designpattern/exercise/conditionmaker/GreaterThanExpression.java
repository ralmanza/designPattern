package org.designpattern.exercise.conditionmaker;

import org.designpattern.exercise.directorybuilder.File;

import java.util.Date;

public class GreaterThanExpression implements IExpression {

    private Date value;

    public GreaterThanExpression(Date value) {
        this.value = value;
    }

    @Override
    public boolean evaluate(File file) {
        return file.getCreated().compareTo(value) > 0;
    }
}
