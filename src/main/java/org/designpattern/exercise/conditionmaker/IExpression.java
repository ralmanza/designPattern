package org.designpattern.exercise.conditionmaker;

import org.designpattern.exercise.directorybuilder.File;

public interface IExpression {

    boolean evaluate(File file);
}
