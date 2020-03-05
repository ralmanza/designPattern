package org.designpattern.exercise.Filter;

import org.designpattern.exercise.directorybuilder.File;
import java.util.List;

public interface IFilter {

    void visitFile(File file);

    List<File> getResult();
}
