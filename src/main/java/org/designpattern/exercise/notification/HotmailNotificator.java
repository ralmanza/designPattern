package org.designpattern.exercise.notification;

import com.sun.deploy.util.StringUtils;

import java.util.List;

public class HotmailNotificator implements INotificator {

    @Override
    public void sendMessage(Message message, List<String> emails) {
        System.out.println("=====================================");
        System.out.println("Send report to HOTMAIL");
        System.out.println("emails: " + StringUtils.join(emails, ", "));
        System.out.println(message.getBody());
    }
}
