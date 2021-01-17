package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicode = '\u0044';
        char copyRight = '\u00A9';
        System.out.println(copyRight);

        boolean myTrue = true;
        boolean myFalse = false;

        //String
        String myString = "This is a string";
        System.out.println(myString + ", is my string");
        String number = "255.55";
        System.out.println(number);

        int result = 1;
        result++;
        result--;
        System.out.println(result);

        result /= 2;
        System.out.println(result);

        boolean isAlien = true;

        if (isAlien) {
            System.out.println("yes he is");
        } else {
            System.out.println("No he's not!");
        }
        System.out.println("No he's not!");

        int topScore = 100;
        boolean isCar = false;

        String wasCar = isCar ? "yeah" : "Fuck";
        System.out.println(wasCar);

        int age = 21;
        String isAge = age <= 20 ? "Get out of here" : "Welcome in!";
        System.out.println(isAge);

        //Challenge!
        double smallerDouble = 20.00;
        double biggerDouble = 80.00;
        double doubleOperation = (smallerDouble + biggerDouble) * 100;
        double remainder = doubleOperation % 40.00;
        boolean isZero = remainder == 0;
        System.out.println(isZero);
        if (!isZero) {
            System.out.println("Got some remainder!");
        }


    }
}
