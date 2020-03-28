package org.designpattern.exercise.strategy;

import java.util.List;

public class HotmailNotificator implements INotificator {

    @Override
    public void sendMessage(String data, List<String> emails) {
        System.out.println("Send report to hotmail accounts");
    }
}
