package org.designpattern.exercise.facade;

import java.util.*;

public class main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList();
        persons.add(new Person("Juan", "Chile"));
        persons.add(new Person("Manuel", "Argentina"));
        persons.add(new Person("Cristina", "Colombia"));
        persons.add(new Person("July", "Bolivia"));
        persons.add(new Person("Roberto", "Uruguay"));
        persons.add(new Person("Alejandro", "Peru"));        
        persons.add(new Person("Xavier", "ecuador"));

        Iterator sortedList;
        System.out.println("\nPersonas Ordenadas por nombre.");
        System.out.println("==============================");        
        sortedList = Util.sortIterator(persons.iterator(), new ComparatorByName());
        Util.printList(sortedList);
        
        System.out.println("\nPersonas Ordenadas por ciudad.");
        System.out.println("==============================");
        sortedList = Util.sortIterator(persons.iterator(), new ComparatorByCity());
        Util.printList(sortedList);
    }

}
