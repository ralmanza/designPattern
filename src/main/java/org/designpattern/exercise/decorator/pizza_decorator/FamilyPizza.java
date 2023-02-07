package org.designpattern.exercise.decorator.pizza_decorator;

public class FamilyPizza extends PizzaDecorator {

    public FamilyPizza(Pizza pizza) {
        super(pizza, null);
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice() + 4.15;
    }

    @Override
    public double getCalories() {
        return this.pizza.getCalories() * 1.95;
    }

    @Override
    public String getDescription() {
        return "Family " + this.pizza.getDescription();
    }

}
