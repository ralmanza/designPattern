package org.designpattern.exercise.composite;

import org.designpattern.exercise.visitor.IVisitor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Directory implements AbstractFile {

    private String name;

    private Date created;

    private Date modified;

    private List<AbstractFile> files;

    public Directory(String name, Date created, Date modified) {
        this.name = name;
        this.created = created;
        this.modified = modified;
        files = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void addFile(AbstractFile file) {
        this.files.add(file);
    }

    @Override
    public void display() {
        System.out.println(this.name);
        this.files.forEach(file -> file.display());
    }

    @Override
    public void accept(IVisitor visitor) {
        this.files.forEach(file -> file.accept(visitor));
    }
}
