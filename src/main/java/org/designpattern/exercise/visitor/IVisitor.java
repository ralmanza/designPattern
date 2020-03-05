package org.designpattern.exercise.visitor;

import org.designpattern.exercise.composite.File;

public interface IVisitor {

    void visitFile(File file);
}
