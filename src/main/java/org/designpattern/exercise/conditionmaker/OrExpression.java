package org.designpattern.exercise.conditionmaker;

import org.designpattern.exercise.directorybuilder.File;

public class OrExpression implements IExpression {

    private IExpression leftExpression;
    private IExpression rightExpression;

    public OrExpression(IExpression leftExpression, IExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public boolean evaluate(File file) {
        return leftExpression.evaluate(file) || rightExpression.evaluate(file);
    }
}
