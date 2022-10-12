package com.revature.java.day02;

import java.util.Scanner;

public class DataTypeDemo {
    public static void main(String[] args) {
        // Research AutoBoxing
        int n1, n2, sum;
//        n1 = Integer.parseInt(args[0]);
//        n2 = Integer.parseInt(args[1]);
        Scanner nInput = new Scanner(System.in);
        System.out.println("Please enter a number:");
        n1 = nInput.nextInt();
        System.out.println("Please enter a second number:");
        n2 = nInput.nextInt();

        sum = n1 + n2;
        System.out.println("Sum of " + n1 + " and " + n2 + " is " + sum);
    }
}
