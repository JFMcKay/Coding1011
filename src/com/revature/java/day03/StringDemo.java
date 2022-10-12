package com.revature.java.day03;

import java.util.StringTokenizer;

public class StringDemo {
    public static void main(String[] args) {
        String string1 = "This is a string literal";
        System.out.println(string1);
        String string2 = new String("This is a string object");
        System.out.println(string2);
//    Strings are said to be immutable
        // Try out all the methods for string buffer and string builder
//        The difference between StringBuilder and StringBuffer has to do with
//        threading. StringBuffer is synchronized
        StringBuffer stBuff = new StringBuffer(string1);
        StringBuilder stBuild = new StringBuilder(string2);
        stBuff.append(" this is appended using String Buffer.");
        System.out.println(stBuff);
        stBuild.append(" this is appended using StringBuilder.");
        System.out.println(stBuild);
        stBuff.reverse();
        System.out.println("Reversed " + stBuff);
//        String Tokenizer parses a string with delimiters it can be any character or space,
//        \t(tab), \n (new line), \r (carriage), \f (formfeed)
        String strToken = "Jeremy:Delvin:Dwyan:Waleed:Thomas";
        StringTokenizer tokenizer = new StringTokenizer(strToken, ":");
        System.out.println("\nThis is my team: ");
        while(tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }
    }
}
