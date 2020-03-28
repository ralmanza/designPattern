package org.designpattern.exercise.interpreter;

import java.util.Date;

public class DriveFile {

    private String name;

    private String extension;

    private double size;

    private String location;

    private Date modified;

    private Date opened;

    private Date created;

    public DriveFile(String name, String extension, double size, String location, Date modified, Date opened, Date created) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.location = location;
        this.modified = modified;
        this.opened = opened;
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Date getOpened() {
        return opened;
    }

    public void setOpened(Date opened) {
        this.opened = opened;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
