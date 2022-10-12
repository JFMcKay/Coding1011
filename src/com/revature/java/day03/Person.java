package com.revature.java.day03;

public class Person {
    String name = "";
    int age = 0;
    static int counter;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
    }

    public Person() {
        counter++;
    }

    public void setUpDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void tellYourDetails(){
        System.out.println("Hello I am " + this.name + " and I am " + this.age + " years old.");
    }

}
