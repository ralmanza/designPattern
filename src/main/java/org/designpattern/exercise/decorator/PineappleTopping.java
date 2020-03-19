package org.designpattern.exercise.decorator;

public class PineappleTopping implements ITopping {

    @Override
    public double getPrice() {
        return 0.79;
    }

    @Override
    public String getIngredient() {
        return "Pineapple";
    }

    @Override
    public double getCalories() {
        return 24;
    }
}
