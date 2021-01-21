package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //inputThenPrintSumAndAverage();
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.14, 1.5));
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        double avg = 0;

        while(true) {
            System.out.println("Enter number #" + i);
            boolean isInt = scanner.hasNextInt();
            if(isInt) {
                int num = scanner.nextInt();
                sum += num;
                avg++;
                i++;
            } else {
                avg = sum / avg;
                int roundedAvg = (int)Math.round(avg);
                System.out.println("SUM = " + sum + " AVG = " + roundedAvg);
                break;
            }
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = width * height;
        double count = Math.ceil(area/areaPerBucket) - extraBuckets;
        return (int)count;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        double count = Math.ceil(area/areaPerBucket);
        return (int)count;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if(areaPerBucket <= 0 || area <= 0) {
            return -1;
        }
        double count = Math.ceil(area/areaPerBucket);
        return (int)count;
    }
}
