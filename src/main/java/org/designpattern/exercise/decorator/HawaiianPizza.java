package org.designpattern.exercise.decorator;

public class HawaiianPizza extends PizzaDecorator {

    private HawaiianPizza(Pizza pizza, ITopping... IToppings) {
        super(pizza, IToppings);
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice() + this.toppings.stream().mapToDouble(topping -> topping.getPrice()).sum() - 0.28;
    }

    @Override
    public double getCalories() {
        return this.pizza.getCalories() + this.toppings.stream().mapToDouble(topping -> topping.getCalories()).sum() - 139;
    }

    @Override
    public String getDescription() {
        return "Pizza Hawaiian(" + String.join(",", getIngredients()) + ")";
    }

    public static Pizza getPizza() {
        return new HawaiianPizza(MargheritaPizza.getPizza(), new HamTopping(), new PineappleTopping());
    }
}
