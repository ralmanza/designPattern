package org.designpattern.exercise.facade;

import java.util.Comparator;

public class ComparatorByCity implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getCity().compareToIgnoreCase(o2.getCity());
    }    
}
