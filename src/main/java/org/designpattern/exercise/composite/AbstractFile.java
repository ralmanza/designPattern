package org.designpattern.exercise.composite;

import org.designpattern.exercise.visitor.IVisitor;

public interface AbstractFile {

    void display();

    void accept(IVisitor visitor);
}
