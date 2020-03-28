package org.designpattern.exercise.observer;

public class Account {

    private String name;

    private String lastName;

    private String user;

    private String email;

    public Account(String name, String lastName, String user, String email) {
        this.name = name;
        this.lastName = lastName;
        this.user = user;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
