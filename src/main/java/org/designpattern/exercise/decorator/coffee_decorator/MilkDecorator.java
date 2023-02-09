package org.designpattern.exercise.decorator.coffee_decorator;

public class MilkDecorator extends AddOnDecorator {

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double price() {
        return beverage.price() + 0.1;
    }
}
