package org.designpattern.exercise.interpreter;

public class EqualsExpression implements IExpression {

    private String value;

    public EqualsExpression(String value) {
        this.value = value;
    }

    @Override
    public boolean evaluate(DriveFile file) {
        return value.equals(file.getExtension());
    }
}
