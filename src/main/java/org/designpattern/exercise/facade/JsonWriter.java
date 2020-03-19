package org.designpattern.exercise.facade;

public class JsonWriter implements FileWriter {

    @Override
    public void write(String data) {
        System.out.println("Export file as *.json");
    }
}
