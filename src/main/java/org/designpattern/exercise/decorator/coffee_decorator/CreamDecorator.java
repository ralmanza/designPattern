package org.designpattern.exercise.decorator.coffee_decorator;

public class CreamDecorator extends AddOnDecorator {

    public CreamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double price() {
        return this.beverage.price() + 0.2;
    }
}
