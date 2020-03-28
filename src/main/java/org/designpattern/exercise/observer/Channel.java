package org.designpattern.exercise.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements ISubject {

    private String name;

    private Account account;

    private List<Video> videos;

    private List<IObserver> observers;

    public Channel(String name, Account account) {
        this.name = name;
        this.account = account;
        this.videos = new ArrayList();
        this.observers = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String getSubjectName() {
        return this.name;
    }

    @Override
    public void subscribe(IObserver observer) {
        this.observers.add(observer);
        observer.setSubject(this);
    }

    @Override
    public void unSubscribe(IObserver observer) {
        this.observers.remove(observer);
        observer.setSubject(null);
    }

    @Override
    public void notifyObservers(Video video) {
        this.observers.forEach(account -> account.update(video));
    }

    public void uploadVideo(Video video) {
        this.videos.add(video);
        notifyObservers(video);
    }
}
