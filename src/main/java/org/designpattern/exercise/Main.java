package org.designpattern.exercise;

import org.designpattern.exercise.Filter.IFilter;
import org.designpattern.exercise.conditionmaker.*;
import org.designpattern.exercise.directorybuilder.Directory;
import org.designpattern.exercise.directorybuilder.File;
import org.designpattern.exercise.Filter.FileFilter;
import org.designpattern.exercise.notification.*;
import org.designpattern.exercise.scheduler.Event;
import org.designpattern.exercise.scheduler.EventRecurrence;
import org.designpattern.exercise.scheduler.Scheduler;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create Drive directory structure
        Date date = new Date();
        Directory rootDirectory = new Directory("Root", date, date);
        Directory music = new Directory("Music", date, date);
        Directory photos = new Directory("Photos", date, date);
        Directory family = new Directory("Family", date, date);
        Directory travel = new Directory("travels", date, date);
        Directory movies = new Directory("movies", date, date);

        File track1 = new File("Don't wary", "mp3", 15, "", date, date, date);
        File track2 = new File("track2 - motivation", "mp3", 11, "", date, date, date);
        File track4 = new File("Resist - motivation", "mkv", 9, "", date, date, date);
        File track5 = new File("virus of beethoven", "mp3", 24, "", date, date, date);

        File video1 = new File("Hobbit 1", "mkv", 3986, "", date, date, date);
        File video2 = new File("Hobbit 2", "mkv", 3589, "", date, date, date);
        File video4 = new File("Hobbit 3", "mkv", 4562, "", date, date, date);
        File video5 = new File("Espectral", "avi", 1569, "", date, date, date);

        File photo1 = new File("IMG_235", "jpeg", 26, "", date, date, date);
        File photo2 = new File("IMG_236", "jpeg", 26, "", date, date, date);
        File photo4 = new File("IMG_237", "jpeg", 26, "", date, date, date);
        File photo5 = new File("IMG_238", "jpeg", 26, "", date, date, date);
        File photo6 = new File("IMG_239", "jpeg", 21, "", date, date, date);
        File photo7 = new File("IMG_240", "jpeg", 26, "", date, date, date);
        File photo8 = new File("IMG_241", "jpeg", 27, "", date, date, date);
        File photo9 = new File("IMG_242", "jpeg", 24, "", date, date, date);
        File photo11 = new File("IMG_1235", "jpeg", 26, "", date, date, date);
        File photo12 = new File("IMG_1236", "jpeg", 26, "", date, date, date);
        File photo14 = new File("IMG_1237", "jpeg", 26, "", date, date, date);
        File photo15 = new File("IMG_1238", "jpeg", 26, "", date, date, date);
        File photo16 = new File("IMG_1239", "jpeg", 21, "", date, date, date);
        File photo17 = new File("IMG_1240", "jpeg", 26, "", date, date, date);
        File photo18 = new File("IMG_1241", "jpeg", 27, "", date, date, date);
        File photo19 = new File("IMG_1242", "jpeg", 24, "", date, date, date);

        music.addFile(track1);
        music.addFile(track2);
        music.addFile(track4);
        music.addFile(track5);

        family.addFile(photo1);
        family.addFile(photo2);
        family.addFile(photo4);
        family.addFile(photo5);
        family.addFile(photo6);
        family.addFile(photo7);
        family.addFile(photo8);
        family.addFile(photo9);

        travel.addFile(photo11);
        travel.addFile(photo12);
        travel.addFile(photo14);
        travel.addFile(photo15);
        travel.addFile(photo16);
        travel.addFile(photo17);
        travel.addFile(photo18);
        travel.addFile(photo19);

        movies.addFile(video1);
        movies.addFile(video2);
        movies.addFile(video4);
        movies.addFile(video5);

        photos.addFile(family);
        photos.addFile(travel);

        rootDirectory.addFile(photos);
        rootDirectory.addFile(movies);
        rootDirectory.addFile(music);

        // Create file filter conditions
        IExpression filterCondition = new AndExpression(
                new EqualsExpression("mkv"),
                new ContainsExpression("Hobbit")
        );
        IExpression filterCondition2 = new AndExpression(
                new EqualsExpression("mp3"),
                new ContainsExpression("motivation")
        );

        // Create filter object
        FileFilter filter1 = new FileFilter(filterCondition);
        FileFilter filter2 = new FileFilter(filterCondition2);

        // Navigate through folder structure and get files that fulfill the condition
        rootDirectory.accept(filter1);

        // Retrieves the files that fulfill the condition
        List<File> results = filter1.getResult();

        // Create notificator
        NotificationManager notificationManager = new NotificationManager();
        INotificator gmail = new GmailNotificator();
        INotificator hotmail = new HotmailNotificator();
        notificationManager.addNotificator(Provider.GMAIL, gmail);
        notificationManager.addNotificator(Provider.HOTMAIL, hotmail);

        // List of emails to notify
        List<String> emails = new ArrayList();
        emails.add("rmartinez@gmail.com");
        emails.add("smolina@gmail.com");
        emails.add("vtaboada@gmail.com");
        emails.add("nmesa@gmail.com");
        emails.add("rmartinez@hotmail.com");
        emails.add("smolina@hotmail.com");
        emails.add("vtaboada@hotmail.com");
        emails.add("nmesa@hotmail.com");
        emails.add("nmesahotmail.com");
        emails.add("nmesa.tmail.com");
        emails.add("nmesa.tmail.com");
        emails.add("ddmesa@yahoo.com");
        emails.add("oCalizaya@yahoo.com");

//        notificationManager.sendReport(new Message("Report", results), emails);

//        LocalDate eventStartDate = LocalDate.of(2020, Month.APRIL, 4);
//        LocalDate eventEndDate = LocalDate.of(2020, Month.APRIL, 4);
//        LocalTime eventTime = LocalTime.of(20, 0);
//        System.out.println(LocalDate.now(ZoneOffset.UTC).toString());
//        System.out.println(LocalDate.now(ZoneOffset.UTC).getDayOfWeek());
//        System.out.println(LocalDate.now(ZoneOffset.UTC).getDayOfMonth());
//        System.out.println(LocalDate.now(ZoneOffset.UTC).getDayOfYear());

        LocalDateTime startDate1 = LocalDateTime.of(2020, Month.APRIL, 4, 21, 9);
        LocalDateTime endDate1 = LocalDateTime.of(2020, Month.APRIL, 5, 21, 6);
        LocalDateTime startDate2 = LocalDateTime.of(2020, Month.APRIL, 4, 21, 10);
        LocalDateTime endDate2 = LocalDateTime.of(2020, Month.APRIL, 5, 21, 6);
        Event event1 = new Event("See Movies", startDate1, endDate1, EventRecurrence.NONE);
        Event event2 = new Event("Listen music", startDate2, endDate2, EventRecurrence.DAILY);
        event2.setDayOfWeek(Calendar.SATURDAY);

        List<Scheduler> schedulers = new ArrayList();
        schedulers.add(new Scheduler(event1, filter1));
        schedulers.add(new Scheduler(event2, filter2));


        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                LocalDateTime now = LocalDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.MINUTES);
                System.out.println("Running: " + now);
                for (Scheduler schedule: schedulers) {
                    if (schedule.getEvent().matchDate(now)) {
                        IFilter filter = schedule.getFilterAcion();
                        rootDirectory.accept(filter);
                        if (filter.getResult().size() > 0)
                            notificationManager.sendReport(new Message("Report", filter.getResult()), emails);
                    }
                }
            }
        }, 0, 60000);
    }
}
