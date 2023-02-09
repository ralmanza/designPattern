package org.designpattern.exercise.decorator.coffee_decorator;

public class HotChocolate implements Beverage {
    @Override
    public double price() {
        return 3.5;
    }
}
