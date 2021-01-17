package com.company;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(8);
        ifPrintDayOfTheWeek(8);
        isLeapYear(1990);
    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }

    public static void ifPrintDayOfTheWeek(int dayOfTheWeek) {
        if(dayOfTheWeek == 0) {
            System.out.println("Sunday");
        } else if(dayOfTheWeek == 1) {
            System.out.println("Monday");
        } else if(dayOfTheWeek == 2) {
            System.out.println("Tuesday");
        } else if(dayOfTheWeek == 3) {
            System.out.println("Wednesday");
        } else if(dayOfTheWeek == 4) {
            System.out.println("Thursday");
        } else if(dayOfTheWeek == 5) {
            System.out.println("Friday");
        } else if(dayOfTheWeek == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static boolean isLeapYear(int year) {
        if(year >= 1 && year <= 9999) {
            if(year % 4 == 0) {
                if(year % 100 == 0) {
                    if(year % 400 == 0) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        } else {
            return false;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if(month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        switch(month) {
            case 1:
                return 31;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return -1;
        }
    }
}

