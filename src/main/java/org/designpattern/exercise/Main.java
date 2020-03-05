package org.designpattern.exercise;

import org.designpattern.exercise.composite.ArithmeticOperation;
import org.designpattern.exercise.composite.CompositeOperand;
import org.designpattern.exercise.composite.IOperation;
import org.designpattern.exercise.composite.NumericOperand;

public class Main {
    public static void main(String[] args) {
        System.out.println("2 + (3 * 5)");
        IOperation ex = new CompositeOperand(
                NumericOperand.fromInt(2),
                new CompositeOperand(NumericOperand.fromInt(3), NumericOperand.fromInt(5), ArithmeticOperation.MULTIPLY),
                ArithmeticOperation.SUM);
        System.out.println(ex.compute());

        System.out.println("(4 / 2) + (3 * 5)");
        ex = new CompositeOperand(
                new CompositeOperand(NumericOperand.fromInt(4), NumericOperand.fromInt(2), ArithmeticOperation.DIVIDE),
                new CompositeOperand(NumericOperand.fromInt(3), NumericOperand.fromInt(5), ArithmeticOperation.MULTIPLY),
                ArithmeticOperation.SUM);
        System.out.println(ex.compute());

        System.out.println("1 + 2 - 3 * 5");
        ex = new CompositeOperand(
                NumericOperand.fromInt(1),
                new CompositeOperand(
                        NumericOperand.fromInt(2),
                        new CompositeOperand(NumericOperand.fromInt(3), NumericOperand.fromInt(5), ArithmeticOperation.MULTIPLY),
                        ArithmeticOperation.SUBSTRACT),
                ArithmeticOperation.SUM);
        System.out.println(ex.compute());
        ex = new CompositeOperand(
                new CompositeOperand(NumericOperand.fromInt(1), NumericOperand.fromInt(2), ArithmeticOperation.SUM),
                new CompositeOperand(NumericOperand.fromInt(3), NumericOperand.fromInt(5), ArithmeticOperation.MULTIPLY),
                ArithmeticOperation.SUBSTRACT);
        System.out.println(ex.compute());
    }
}
