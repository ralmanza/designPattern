package org.designpattern.exercise.visitor;

import org.designpattern.exercise.composite.File;

import java.util.ArrayList;
import java.util.List;

public class FileVisitor implements IVisitor {

    List<File> result;

    String extension;

    public FileVisitor(String extension) {
        this.extension = extension;
        this.result = new ArrayList();
    }

    public List<File> getResult() {
        return result;
    }

    @Override
    public void visitFile(File file) {
        if (extension.equalsIgnoreCase(file.getExtension())) this.result.add(file);
    }
}
