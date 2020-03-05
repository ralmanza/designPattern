package org.designpattern.exercise.notification;

import java.util.List;

public interface INotificator {

    void sendMessage(Message message, List<String> emails);
}
