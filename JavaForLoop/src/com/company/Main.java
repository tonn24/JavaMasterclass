package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount*(interestRate/100));
    }

    public static boolean isPrime(int n) {
        if(n==1) {
            return false;
        }
        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumNumbersDivisibleBy3And5() {
        int s = 0;
        int count = 0;
        for(int i = 1; i <= 1000; i++) {
            if(count > 4) {
                break;
            }
            if((i % 3 == 0) && (i % 5 == 0)) {
                s += i;
                System.out.println(i);
                count ++;
            }
        }
        return s;
    }

    public static boolean isOdd(int number) {
        if(number < 0) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if(end < start || start <= 0) {
            return -1;
        }
        int s = 0;
        for(int i = start; i <= end; i++) {
            if(isOdd(i)) {
                s += i;
            }
        }
        return s;
    }
}
