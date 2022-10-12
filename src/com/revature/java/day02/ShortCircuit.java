package com.revature.java.day02;

import java.util.Scanner;

public class ShortCircuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number[] = new int[3];
        for(int i = 0;i < 3;i++) {
            // I wrote a ternary to determine the string used
            String enterN = (i < 1) ? "Please enter a number: " : "Please enter another number: ";
            System.out.println(enterN);
            number[i] = scanner.nextInt();
        }
        int greatest = 0;

        if (number[0] > number[1] && number[0] > number[2]) {
            greatest = number[0];
        } else if (number[0] < number[1] && number[1] > number[2]) {
            greatest = number[1];
        } else {
            greatest = number[2];
        }

        System.out.println("The greatest number is " + greatest);
    }
}
