package org.designpattern.exercise.Filter;

import org.designpattern.exercise.conditionmaker.IExpression;
import org.designpattern.exercise.directorybuilder.File;

import java.util.ArrayList;
import java.util.List;

public class FileFilter implements IFilter {

    List<File> result;

    IExpression filterCondition;

    public FileFilter(IExpression filterCondition) {
        this.filterCondition = filterCondition;
        this.result = new ArrayList();
    }

    @Override
    public List<File> getResult() {
        return result;
    }

    @Override
    public void visitFile(File file) {
        if (this.filterCondition.evaluate(file)) this.result.add(file);
    }
}
