package com.revature.java.day03;

public class PersonManager {
    public static void main(String[] args) {
        Person person = new Person();
        person.setUpDetails("Person", 45);
        person.tellYourDetails();
        Person jeremy = new Person("Jeremy", 45);
        jeremy.tellYourDetails();
        System.out.println(Person.counter + " is the Number of person objects created.");
    }
}
