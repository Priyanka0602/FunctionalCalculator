package com.company.CalculatorFunctionalProgramming;

public enum Menu {

    ADDITION((a, b) -> a + b),
    SUBTRACT((a, b) -> a - b),
    MULTIPLY((a, b) -> a * b),
    DIVIDE((a, b) -> a / b);

    public Operatable<Integer> operation;

    Menu(Operatable<Integer> operation) {
        this.operation = operation;
    }

    public int operate(int value, int anotherValue) {
        return this.operation.operate(value, anotherValue);
    }
}
