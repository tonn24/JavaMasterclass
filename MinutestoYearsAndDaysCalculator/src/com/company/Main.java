package com.company;

public class Main {

    public static void main(String[] args) {
	    printYearsAndDays(525600);
    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid value!");
        } else {
            int hours = (int)minutes / 60;
            int days = (int)hours / 24;
            int years = (int)days / 365;
            int daysLeft = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + daysLeft + " d");
        }
    }
}
