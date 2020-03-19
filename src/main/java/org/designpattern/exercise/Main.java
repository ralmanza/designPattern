package org.designpattern.exercise;

import org.designpattern.exercise.decorator.*;

public class Main {
    public static void main(String[] args) {
        Pizza margherita = MargheritaPizza.getPizza();
        System.out.println(margherita.getPrice());
        System.out.println(margherita.getCalories());
        System.out.println(margherita.getDescription());
        System.out.println("===================================");
        Pizza salami = SalamiPizza.getPizza();
        System.out.println(salami.getPrice());
        System.out.println(salami.getCalories());
        System.out.println(salami.getDescription());
        System.out.println("===================================");
        Pizza hawaiian = HawaiianPizza.getPizza();
        System.out.println(hawaiian.getPrice());
        System.out.println(hawaiian.getCalories());
        System.out.println(hawaiian.getDescription());
        System.out.println("===================================");
        Pizza familyHawaiian = new FamilyPizza(HawaiianPizza.getPizza());
        System.out.println(familyHawaiian.getPrice());
        System.out.println(familyHawaiian.getCalories());
        System.out.println(familyHawaiian.getDescription());
        System.out.println("===================================");
        Pizza familySalami = new FamilyPizza(SalamiPizza.getPizza());
        System.out.println(familySalami.getPrice());
        System.out.println(familySalami.getCalories());
        System.out.println(familySalami.getDescription());
        System.out.println("===================================");
        Pizza familyMargherita = new FamilyPizza(MargheritaPizza.getPizza());
        System.out.println(familyMargherita.getPrice());
        System.out.println(familyMargherita.getCalories());
        System.out.println(familyMargherita.getDescription());
        System.out.println("===================================");
    }
}