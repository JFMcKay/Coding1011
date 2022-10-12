package com.revature.java.day03;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(20, 20);
        System.out.println("\nResult = " + result);
        int result2 = calculator.add(20, 20, 20);
        System.out.println("\nResult2 = " + result2);

        int result3 = calculator.addNumbers(5,5,5,5,5,5,5);
        System.out.println("\nResult3 = " + result3);
    }
}
