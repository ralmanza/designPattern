package org.designpattern.exercise.composite;

public class NumericOperand implements IOperation {

    private double value;

    public NumericOperand(double value) {
        this.value = value;
    }

    public static IOperation fromInt(int value) {
        return new NumericOperand(value);
    }

    public static IOperation fromDouble(int value) {
        return new NumericOperand(value);
    }

    @Override
    public double compute() {
        return this.value;
    }
}
