package org.designpattern.exercise.decorator.pizza_decorator;

import org.designpattern.exercise.decorator.coffee_decorator.Beverage;
import org.designpattern.exercise.decorator.coffee_decorator.Coffee;
import org.designpattern.exercise.decorator.coffee_decorator.CreamDecorator;
import org.designpattern.exercise.decorator.coffee_decorator.HotChocolate;
import org.designpattern.exercise.decorator.coffee_decorator.MilkDecorator;
import org.designpattern.exercise.decorator.coffee_decorator.Tea;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.number.IsCloseTo;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;

public class BveragePricingTest {

    @Test
    public void computes_coffee_price() {
        Beverage coffee = new Coffee();
        assertThat(coffee.price(), CoreMatchers.is(IsCloseTo.closeTo(1.5, 0.001)));
    }

    @Test
    public void computes_tea_price() {
        Beverage tea = new Tea();
        MatcherAssert.assertThat(tea.price(), CoreMatchers.is(IsCloseTo.closeTo(2.50, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_price() {
        Beverage hotChocolate = new HotChocolate();
        assertThat(hotChocolate.price(), CoreMatchers.is(IsCloseTo.closeTo(3.5, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_price() {
        Tea tea = new Tea();
        Beverage teaWithMilk = new MilkDecorator(tea);
        assertThat(teaWithMilk.price(), CoreMatchers.is(IsCloseTo.closeTo(2.6, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_price() {
        Beverage coffee = new Coffee();

        Beverage coffeeWithMilk = new MilkDecorator(coffee);
        assertThat(coffeeWithMilk.price(), CoreMatchers.is(IsCloseTo.closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() {
        Coffee coffee = new Coffee();
        Beverage coffeeWithMilk = new MilkDecorator(coffee);
        Beverage coffeeWithMilkAndCream = new CreamDecorator(coffeeWithMilk);
        assertThat(coffeeWithMilkAndCream.price(), CoreMatchers.is(IsCloseTo.closeTo(1.8, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_price() {
        HotChocolate hotChocolate = new HotChocolate();
        Beverage hotChocolateWithCream = new CreamDecorator(hotChocolate);
        assertThat(hotChocolateWithCream.price(),  CoreMatchers.is(IsCloseTo.closeTo(3.7, 0.001)));
    }
}
