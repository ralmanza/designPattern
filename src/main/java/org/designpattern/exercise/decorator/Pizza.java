package org.designpattern.exercise.decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Pizza {

    protected List<ITopping> toppings;

    public Pizza(ITopping... toppings) {
        if (toppings == null) this.toppings = new ArrayList();
        else this.toppings = Arrays.asList(toppings);
    }

    public abstract double getCalories();

    public abstract double getPrice();

    public abstract String getDescription();

    public abstract List<String> getIngredients();
}
