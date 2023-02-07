package org.designpattern.exercise.decorator.pizza_decorator;

public class OnionTopping implements ITopping {

    @Override
    public double getPrice() {
        return 0.69;
    }

    @Override
    public double getCalories() {
        return 22;
    }

    @Override
    public String getIngredient() {
        return "Onion";
    }
}
