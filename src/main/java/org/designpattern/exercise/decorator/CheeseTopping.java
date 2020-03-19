package org.designpattern.exercise.decorator;

public class CheeseTopping implements ITopping {

    @Override
    public double getCalories() {
        return 92;
    }

    @Override
    public double getPrice() {
        return 0.69;
    }

    @Override
    public String getIngredient() {
        return "Cheese";
    }
}
