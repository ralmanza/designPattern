package org.designpattern.exercise.strategy;

import java.util.List;

public class GmailNotificator implements INotificator {

    @Override
    public void sendMessage(String data, List<String> emails) {
        System.out.println("Send report to gmail accounts");
    }
}
