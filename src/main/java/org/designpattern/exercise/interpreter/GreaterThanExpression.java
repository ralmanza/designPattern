package org.designpattern.exercise.interpreter;

import java.util.Date;

public class GreaterThanExpression implements IExpression {

    private Date value;

    public GreaterThanExpression(Date value) {
        this.value = value;
    }

    @Override
    public boolean evaluate(DriveFile file) {
        return file.getCreated().compareTo(value) > 0;
    }
}
