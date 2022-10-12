package com.revature.java.day03;

public class Calculator {
    public int add (int num1, int num2) {
        return num1 + num2;
    }
// This is an example of overloading which is Polymorphism
    public int add (int num1, int num2, int num3) {
        return num1 + num2 +num3;
    }
//    Var-Args can take multiple arguments of the same type.
//    And should be the last parameter if used with multiple types
    public int addNumbers (int ...num) {
        int sum = 0;
        for (int i:num) {
            sum += i;
        }
        return sum;
    }
    public int subtract (int num1, int num2) {
        return num1 - num2;
    }

    public int multiply (int num1, int num2) {
        return num1 * num2;
    }

    public int divide (int num1, int num2) {
        return num1 / num2;
    }
}
