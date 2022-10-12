package com.revature.java.day02;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number[] = new int[3];
        for(int i = 0;i < 3;i++) {
            // I wrote a ternary to determine the string used
            String enterN = (i < 1) ? "Please enter a number: " : "Please enter another number: ";
            System.out.println(enterN);
            number[i] = scanner.nextInt();
        }

        //        This ternary expression tests 3 numbers the first condition tests the first 2
        //        and the second condition test the first and third only if the first number is greater
        //        the third condition is tested only if the second number is bigger and tested to see
        //        if the second and third number is greater.
        int greatest = (number[0] > number[1])
                ? ((number[0] > number[2]) ? number[0] : number[2])
                : ((number[1] > number[2]) ? number[1] : number[2]);
        System.out.println("The greatest number is " + greatest);
    }
}
