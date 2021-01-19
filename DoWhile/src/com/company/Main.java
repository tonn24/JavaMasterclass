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
        System.out.println(hasSameLastDigit(12, 43, 52));
        System.out.println(getGreatestCommonDivisor(25, 15));
        printFactors(6);
        System.out.println(reverse(1234));
        System.out.println(getDigitCount(315));
        System.out.println(10%10);
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

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if(!isValid(n1) || !isValid(n2) || !isValid(n3)) {
            return false;
        }
        int n1RightDigit = n1 % 10;
        int n2RightDigit = n2 % 10;
        int n3RightDigit = n3 % 10;
        return n1RightDigit == n2RightDigit || n1RightDigit == n3RightDigit || n2RightDigit == n3RightDigit;
    }

    public static boolean isValid(int num) {
        if(num < 10 || num > 1000) {
            return false;
        }
        return true;
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int divisor = 0;
        for(int i = 1; ((i <= first) && (i <= second)); i++) {
            if((first % i == 0) && (second % i == 0)) {
                divisor = i;
            }
        }
        return divisor;
    }

    public static void printFactors(int num) {
        if(num < 1) {
            System.out.println("Invalid value");
        }
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void numberToWords(int nums) {
        if(nums < 0) {
            System.out.println("Invalid Value");
        }
        int num = reverse(nums);
        int lastDigit = 0;
        String numbers = "";
        while(num > 0) {
            lastDigit = num % 10;
            switch(lastDigit) {
                case 0:
                    numbers += "Zero ";
                    break;
                case 1:
                    numbers += "One ";
                    break;
                case 2:
                    numbers += "Two ";
                    break;
                case 3:
                    numbers += "Three ";
                    break;
                case 4:
                    numbers += "Four ";
                    break;
                case 5:
                    numbers += "Five ";
                    break;
                case 6:
                    numbers += "Six ";
                    break;
                case 7:
                    numbers += "Seven ";
                    break;
                case 8:
                    numbers += "Eight ";
                    break;
                case 9:
                    numbers += "Nine ";
                    break;
            }
            num /= 10;
        }
        if(nums % 10 == 0) {
            numbers += "Zero";
        }
        System.out.println(numbers);
    }

    public static int reverse(int num) {
        int reversedNumber = 0;
        while(num != 0) {
            int remainder = num % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            num /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int num) {
        int count = 0;
        if(num < 0) {
            return -1;
        }
        while(num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
