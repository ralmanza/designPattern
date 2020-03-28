package org.designpattern.exercise.observer;

import java.util.Date;

public class Video {

    private String title;

    private String description;

    private Date published;

    public Video(String title, String description, Date published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }
}
