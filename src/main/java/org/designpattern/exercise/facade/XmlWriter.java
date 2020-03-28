package org.designpattern.exercise.facade;

public class XmlWriter implements FileWriter {

    @Override
    public void write(String data) {
        System.out.println("Export file as *.xml");
    }
}
