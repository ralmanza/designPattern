package org.designpattern.exercise.observer;

public interface ISubject {

    String getSubjectName();

    void subscribe(IObserver observer);

    void unSubscribe(IObserver observer);

    void notifyObservers(Video video);
}
