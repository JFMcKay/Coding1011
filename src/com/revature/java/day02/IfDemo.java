package com.revature.java.day02;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNumber;
        System.out.println("Enter The Day Number From (1-7): ");
        dayNumber = scanner.nextInt();
        if (dayNumber > 5 && dayNumber <= 7) {
            System.out.println("It's the Freakin' Weekend");
        } else if (dayNumber >= 1 && dayNumber <= 5){
            System.out.println("Week day = weeeeeaaaak dayy");
        } else {
            System.out.println("Incorrect input");
        }
    }
}
