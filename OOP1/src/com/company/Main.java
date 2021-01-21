package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4.0);
//        System.out.println("Add = " + calculator.getAdditionResult());
//        System.out.println("Sub = " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("Multiplication = " + calculator.getMultiplicationResult());
//        System.out.println("Division = " + calculator.getDivisionResult());

        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(-5);
        System.out.println(person.getAge());
        System.out.println("fullname = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("John");
        person.setLastName("West");
        person.setAge(18);
        System.out.println("fullname = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
    }
}
