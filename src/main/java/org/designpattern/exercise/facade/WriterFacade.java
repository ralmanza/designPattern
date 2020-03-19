package org.designpattern.exercise.facade;

public class WriterFacade {

    public static void write(String data, FileFormat format) {
        FileWriter writter;
        switch (format) {
            case XML:
                writter = new XmlWriter();
                break;
            case JSON:
                writter = new JsonWriter();
                break;
            case DITA:
                writter = new DitaWriter();
                break;
            default:
                writter = new JsonWriter();
                break;
        }

        writter.write(data);
    }
}
