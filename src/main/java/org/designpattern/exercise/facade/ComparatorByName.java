package org.designpattern.exercise.facade;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }    
}
