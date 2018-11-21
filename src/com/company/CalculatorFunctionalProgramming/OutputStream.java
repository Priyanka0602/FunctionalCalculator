package com.company.CalculatorFunctionalProgramming;
import java.util.Arrays;

public class OutputStream {
    public static void printMenu(Menu... value) {
        Arrays.stream(value)
              .forEach(e -> System.out.println(e.ordinal() + " " + e));
    }
    public static void printResult(Object value) {
        System.out.println(value);
    }
}
