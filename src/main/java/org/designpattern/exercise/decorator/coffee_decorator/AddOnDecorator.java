package org.designpattern.exercise.decorator.coffee_decorator;

public abstract class AddOnDecorator implements Beverage {

    protected Beverage beverage;

    public AddOnDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
