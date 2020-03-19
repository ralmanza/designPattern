package org.designpattern.exercise.decorator;

import java.util.Arrays;
import java.util.List;

public class MargheritaPizza extends Pizza {

    private MargheritaPizza(ITopping... toppings) {
        super(toppings);
    }

    @Override
    public double getPrice() {
        return this.toppings.stream().mapToDouble(topping -> topping.getPrice()).sum() + 4.3;
    }

    @Override
    public double getCalories() {
        return this.toppings.stream().mapToDouble(topping -> topping.getCalories()).sum() + 1012;
    }

    @Override
    public String getDescription() {
        return "Pizza Margherita(" + String.join(",", getIngredients()) + ")";
    }

    @Override
    public List<String> getIngredients() {
        return Arrays.asList("Tomato", this.toppings.get(0).getIngredient());
    }

    public static Pizza getPizza() {
        return new MargheritaPizza(new CheeseTopping());
    }
}
