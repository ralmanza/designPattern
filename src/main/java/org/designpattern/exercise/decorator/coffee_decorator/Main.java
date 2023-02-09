package org.designpattern.exercise.decorator.coffee_decorator;

public class Main {
    public static void main(String[] args) {
        Beverage coffe = new Coffee();

        Beverage coffeWithMilk = new MilkDecorator(coffe);
        System.out.println(coffeWithMilk.price());

        Beverage coffeWithMilkAndCream = new CreamDecorator(coffeWithMilk);
        System.out.println(coffeWithMilkAndCream.price());
    }
}
