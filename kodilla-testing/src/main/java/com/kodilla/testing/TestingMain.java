package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        int addResult = calculator.add(5, 5);

        System.out.println("Testing add method: ");

        if (addResult == 10) {
            System.out.println("Calculator add - test OK");
        } else {
            System.out.println("Calculator substract - Error!");
        }

        int subtractResult = calculator.subtract(5, 5);

        System.out.println("Testing subtract method: ");

        if (subtractResult == 0) {
            System.out.println("Calculator substract - test OK");
        } else {
            System.out.println("Calculator substract - Error!");
        }
    }
}