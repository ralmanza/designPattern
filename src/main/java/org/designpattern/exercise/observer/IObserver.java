package org.designpattern.exercise.observer;

public interface IObserver {

    void update(Video video);

    void setSubject(ISubject subject);
}
