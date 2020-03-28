package org.designpattern.exercise.facade;

public class DitaWriter implements FileWriter {

    @Override
    public void write(String data) {
        System.out.println("Export file as *.dita");
    }
}
