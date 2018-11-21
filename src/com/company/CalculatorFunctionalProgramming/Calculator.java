package com.company.CalculatorFunctionalProgramming;
import static com.company.CalculatorFunctionalProgramming.InputStream.input;
import static com.company.CalculatorFunctionalProgramming.OutputStream.*;

public class Calculator {
    public static void main(String args[]) {
        printMenu(Menu.values());
        printResult(Menu.values()[input()].operate(input(), input()));
    }
}
