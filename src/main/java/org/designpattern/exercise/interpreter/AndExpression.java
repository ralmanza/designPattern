package org.designpattern.exercise.interpreter;

public class AndExpression implements IExpression {

    private IExpression leftExpression;
    private IExpression rightExpression;

    public AndExpression(IExpression leftExpression, IExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public boolean evaluate(DriveFile file) {
        return leftExpression.evaluate(file) && rightExpression.evaluate(file);
    }
}
