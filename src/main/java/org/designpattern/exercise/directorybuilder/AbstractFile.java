package org.designpattern.exercise.directorybuilder;

import org.designpattern.exercise.Filter.IFilter;

public interface AbstractFile {

    void display();

    void accept(IFilter visitor);
}
