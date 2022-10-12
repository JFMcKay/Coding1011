package com.revature.java.day02;

import java.util.Scanner;

public class FavoriteShows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shows[] = new String[5];
        for (int i = 0;i < 5;i++) {
            System.out.println("Please enter a favorite show: ");
            shows[i] = scanner.nextLine();
        }
        for (String s: shows) {
            System.out.println("This is one of my favorite shows " + s);
        }
    }
}
