package org.designpattern.exercise.decorator.pizza_decorator;

public class HamTopping implements ITopping {

    @Override
    public double getPrice() {
        return 0.99;
    }

    @Override
    public double getCalories() {
        return 35;
    }

    @Override
    public String getIngredient() {
        return "Ham";
    }
}
