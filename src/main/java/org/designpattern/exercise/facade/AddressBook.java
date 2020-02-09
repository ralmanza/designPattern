package org.designpattern.exercise.facade;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<Person> persons;

    public AddressBook() {
        this.persons = new ArrayList();
        persons.add(new Person("Juan", "Chile"));
        persons.add(new Person("Manuel", "Argentina"));
        persons.add(new Person("Cristina", "Colombia"));
        persons.add(new Person("July", "Bolivia"));
        persons.add(new Person("Roberto", "Uruguay"));
        persons.add(new Person("Alejandro", "Peru"));
        persons.add(new Person("Xavier", "ecuador"));
    }

    public int getSize() {
        return this.persons.size();
    }

    public Person getPerson(int position) {
        return this.persons.get(position);
    }
}
