package org.designpattern.exercise.strategy;

import java.util.List;

public interface INotificator {

    void sendMessage(String data, List<String> emails);
}
