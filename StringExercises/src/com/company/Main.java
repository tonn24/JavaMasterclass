package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "208";
        int number = Integer.parseInt(numberAsString);
        System.out.println(number);
        number += 1;
        numberAsString += 1;
        System.out.println(number);
        System.out.println(numberAsString);
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(5, 0, 4));

        printStars(2);  System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(217/2);
        printStars(8);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0|| goal < 0) {
            return false;
        }
        bigCount *= 5;
        return bigCount + smallCount >= goal && smallCount >= goal % 5;
    }

    public static int getLargestPrime(int num) {
        if(num <= 1){
            return -1;
        }
        for(int i = num/2; i >= 2; i--) {
            if(num % i == 0) {
                num = i;
            }
        }
        return num;
    }

    public static void printStars(int n){
        if (n < 5){
            System.out.println("Invalid number."+"\n"+
                    "Please do not put any number bellow to 5.");
        } else{
            for(int i=1;i <= n;i++){
                for(int j = 1;j <= n;j++){
                    if(((i+j)==(n+1))||(i==j)||(((i==n)||(j==n))||((i==1)||(j==1)))){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }


}

