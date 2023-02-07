package org.designpattern.exercise.decorator.pizza_decorator;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaDecorator extends Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza, ITopping... toppings) {
        super(toppings);
        this.pizza = pizza;
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = new ArrayList(this.pizza.getIngredients());
        this.toppings.forEach(topping -> ingredients.add(topping.getIngredient()));
        return ingredients;
    }
}
