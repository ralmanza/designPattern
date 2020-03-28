package org.designpattern.exercise.interpreter;

public class ContainsExpression implements IExpression {

    private String value;

    public ContainsExpression(String value) {
        this.value = value;
    }

    @Override
    public boolean evaluate(DriveFile file) {
        return file.getName().toLowerCase().contains(value.toLowerCase());
    }
}
