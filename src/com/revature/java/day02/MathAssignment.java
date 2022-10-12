package com.revature.java.day02;

import java.util.Scanner;

public class MathAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter a number: ");
        num1 = scanner.nextInt();
        System.out.println("Enter a second number: ");
        num2 = scanner.nextInt();
        MathMethods math = new MathMethods();
        System.out.println("The numbers added together are " + math.add(num1, num2));
        System.out.println("The number subtracted are " + math.subtract(num1, num2));
        System.out.println("The numbers multiplied are " + math.multiply(num1, num2));
        System.out.println("The numbers divided are " + math.divide(num1,num2));
    }
}
class MathMethods {
    public int add (int num1, int num2) {
        return num1 + num2;
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