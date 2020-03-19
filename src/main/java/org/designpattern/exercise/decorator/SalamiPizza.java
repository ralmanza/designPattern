package org.designpattern.exercise.decorator;

public class SalamiPizza extends PizzaDecorator {

    private SalamiPizza(Pizza pizza, ITopping... IToppings) {
        super(pizza, IToppings);
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice() + this.toppings.stream().mapToDouble(topping -> topping.getPrice()).sum() + 0.01;
    }

    @Override
    public double getCalories() {
        return this.pizza.getCalories() + this.toppings.stream().mapToDouble(topping -> topping.getCalories()).sum() - 30;
    }

    @Override
    public String getDescription() {
        return "Pizza Salami(" + String.join(",", getIngredients()) + ")";
    }

    public static Pizza getPizza() {
        return new SalamiPizza(MargheritaPizza.getPizza(), new SalamiTopping());
    }
}
