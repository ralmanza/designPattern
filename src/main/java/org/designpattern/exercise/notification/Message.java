package org.designpattern.exercise.notification;

import org.designpattern.exercise.directorybuilder.File;

import java.util.List;

public class Message {
    private String title;

    private String body;

    public Message(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Message(String title, List<File> files) {
        this.title = title;
        this.body = "List of files\n";
        for (File file: files) {
            this.body += "\t" + file.getName() + "." + file.getExtension() + "\n";
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
