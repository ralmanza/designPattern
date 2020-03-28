package org.designpattern.exercise.observer;

public class VideoObserver implements IObserver {

    private Account account;

    private ISubject subject;

    public VideoObserver(Account account) {
        this.account = account;
    }

    @Override
    public void update(Video video) {
        System.out.println("Hey " + this.account.getUser() + ", " + this.subject.getSubjectName() + " upload a new video: " + video.getTitle());
    }

    @Override
    public void setSubject(ISubject subject) {
        this.subject = subject;
    }
}
