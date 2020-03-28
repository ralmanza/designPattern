package org.designpattern.exercise;


import org.designpattern.exercise.strategy.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        NotificatorContext context = new NotificatorContext();
        INotificator gmail = new GmailNotificator();
        INotificator hotmail = new HotmailNotificator();

        List<String> emails = new ArrayList();
        emails.add("rmartinez@gmail.com");
        emails.add("smolina@gmail.com");
        emails.add("vtaboada@gmail.com");
        emails.add("nmesa@gmail.com");
        emails.add("rmartinez@hotmail.com");
        emails.add("smolina@hotmail.com");
        emails.add("vtaboada@hotmail.com");
        emails.add("nmesa@hotmail.com");

        context.setNotificator(gmail);
        context.sendReport("Report message", emails);

        context.setNotificator(hotmail);
        context.sendReport("Report message", emails);
    }
}
