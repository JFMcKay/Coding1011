package com.revature.java.day02;

public class LoopDemo {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++) {
            System.out.println("For Loop executed " + i + " times.");
        }
        System.out.println("*************************************");
        int j = 5;
        while(j>=1) {
            System.out.println("While Loop executed " + j + " times.");
            j--;
        }
        System.out.println("******* Do While runs at least once ****");
        do {
            System.out.println("While Loop executed " + j + " times.");
            j++;
        } while (j<=5);

    }
}
