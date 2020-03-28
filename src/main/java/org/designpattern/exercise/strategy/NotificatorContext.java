package org.designpattern.exercise.strategy;

import java.util.List;
import java.util.Map;

public class NotificatorContext {

    private INotificator notificator;

    public void setNotificator(INotificator notificator) {
        this.notificator = notificator;
    }

    public void sendReport(String data, List<String> emails) {
        this.notificator.sendMessage(data, emails);
    }
}
