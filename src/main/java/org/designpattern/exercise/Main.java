package org.designpattern.exercise;

import org.designpattern.exercise.facade.FileFormat;
import org.designpattern.exercise.facade.GithubAPI;
import org.designpattern.exercise.facade.WriterFacade;

public class Main {
    public static void main(String[] args) {
        GithubAPI api = new GithubAPI();
        WriterFacade.write(api.getUser("testId"), FileFormat.JSON);
        WriterFacade.write(api.getUser("testId"), FileFormat.XML);
        WriterFacade.write(api.getUser("testId"), FileFormat.DITA);
    }
}