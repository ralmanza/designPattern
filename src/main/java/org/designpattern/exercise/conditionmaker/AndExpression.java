package org.designpattern.exercise.conditionmaker;

import org.designpattern.exercise.directorybuilder.File;

public class AndExpression implements IExpression {

    private IExpression leftExpression;
    private IExpression rightExpression;

    public AndExpression(IExpression leftExpression, IExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public boolean evaluate(File file) {
        return leftExpression.evaluate(file) && rightExpression.evaluate(file);
    }
}
