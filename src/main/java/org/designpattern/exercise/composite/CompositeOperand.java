package org.designpattern.exercise.composite;

public class CompositeOperand implements IOperation {

    private IOperation left;

    private IOperation right;

    private ArithmeticOperation operation;

    public CompositeOperand(IOperation left, IOperation right, ArithmeticOperation op) {
        this.left = left;
        this.right = right;
        this.operation = op;
    }

    public void addLeft(IOperation left) {
        this.left = left;
    }

    public void addRight(IOperation right) {
        this.right = right;
    }

    @Override
    public double compute() {
        double result = 0;
        switch (operation) {
            case SUBSTRACT:
                result = this.left.compute() - this.right.compute();
                break;
            case MULTIPLY:
                result = this.left.compute() * this.right.compute();
                break;
            case DIVIDE:
                result = this.left.compute() / this.right.compute();
                break;
            default:
                result = this.left.compute() + this.right.compute();
                break;
        };

        return result;
    }
}
