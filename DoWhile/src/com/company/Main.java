package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("asdf".substring(3, 4));
        System.out.println(sumDigits(125));
        System.out.println(sumDigits2(125));
        System.out.println(isPalindrome(121));
        System.out.println(sumFirstAndLastDigit(1234));
        System.out.println((getEvenDigitSum(1351634631)));
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean isEvenNumber(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    private static int sumDigits(int number) {
        int s = 0;
        int i = 0;
        String numberString = String.valueOf(number);
        if(number < 10) {
            return -1;
        }
        while(i < numberString.length()) {
            int newNumber = Integer.parseInt(numberString.substring(i, i+1));
            s += newNumber;
            i++;
        }
        return s;
    }

    private static int sumDigits2(int number) {
        if(number < 10) {
            return -1;
        }

        int sum = 0;
        while(number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }

    public static boolean isPalindrome(int number)  {
        int reverse = 0;
        int temp = number;

        while (number != 0) {
            int remainder = number % 10;
            System.out.println(remainder);
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return reverse == temp;
    }

    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        int firstDigit = number;
        while(firstDigit > 10) {
            firstDigit /= 10;
        }
        return firstDigit + lastDigit;
    }

    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }
        int sum = 0;
        for(; number > 0;  number /= 10) {
            if(number % 2 == 0) {
                int num = number % 10;
                sum += num;
            }
        }
        return sum;
    }

    public static boolean hasSharedDigit(int n1, int n2) {
        if(n1 < 10 || n1 > 99 || n2 < 10 || n2 > 99) {
            return false;
        }
        int firstDigitN1 = n1 / 10;
        int lastDigitN1 = n1 % 10;
        int firstDigitN2 = n2 / 10;
        int lastDigitN2 = n2 % 10;
        return firstDigitN1 == firstDigitN2 || firstDigitN1 == lastDigitN2 || lastDigitN1 == lastDigitN2 || lastDigitN1 == firstDigitN2;
    }
}
