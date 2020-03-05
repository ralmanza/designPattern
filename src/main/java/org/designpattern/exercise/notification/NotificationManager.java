package org.designpattern.exercise.notification;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class NotificationManager {

    private Map<String, INotificator> notificators;

    public NotificationManager() {
        this.notificators = new HashMap();
    }

    public void addNotificator(final String provider, INotificator notificator) {
        this.notificators.put(provider, notificator);
    }

    public void sendReport(Message message, List<String> emails) {
        Map<String, List<String>> validEmails = new HashMap();
        List<String> invalidMails = new ArrayList();
        List<String> notSupportedMails = new ArrayList();

        for (String email: emails) {
            if (isValidEmail(email)) {
                String domain = getEmailDomain(email);
                String prov = domain.split("\\.")[0];

                String provider = prov.toUpperCase();

                if (this.notificators.get(provider) == null) {
                    notSupportedMails.add(email);
                } else {
                    if (validEmails.get(provider) == null) validEmails.put(provider, new ArrayList());
                    validEmails.get(provider).add(email);
                }
            } else {
                invalidMails.add(email);
            }
        }

        for (Map.Entry<String,List<String>> entry : validEmails.entrySet()) {
            this.notificators.get(entry.getKey()).sendMessage(message, entry.getValue());
        }

        if (invalidMails.size() > 0) {
            System.out.println("=====================================");
            System.out.println("The follow emails are invalid");
            System.out.println(StringUtils.join(invalidMails, ", "));
            System.out.println("");
        }

        if (notSupportedMails.size() > 0) {
            System.out.println("=====================================");
            System.out.println("The follow emails are are not supported to sent message notification");
            System.out.println(StringUtils.join(notSupportedMails, ", "));
            System.out.println("");
        }
    }

    private boolean isValidEmail(String email) {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(email).matches();
    }

    private String getEmailDomain(String email) {
        if (email == null) return "";
        return email.substring(email.indexOf("@") + 1);
    }
}
