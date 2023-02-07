package org.designpattern.exercise.decorator.pizza_decorator;

public class SalamiTopping implements ITopping {

    @Override
    public double getPrice() {
        return 0.99;
    }

    @Override
    public String getIngredient() {
        return "Salami";
    }

    @Override
    public double getCalories() {
        return 86;
    }
}
