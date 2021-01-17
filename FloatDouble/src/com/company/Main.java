package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMax_FloatValue = Float.MAX_VALUE;
        System.out.println("Min float value is " + myMinFloatValue + " and max float value is " +  myMax_FloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMax_DoubleValue = Double.MAX_VALUE;
        System.out.println("Min Double value is " + myMinDoubleValue + " and max Double value is " +  myMax_DoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        int pounds = 25;
        double poundsToKgRatio = 0.453592;
        System.out.println(pounds + " pounds = " + pounds * poundsToKgRatio + "kg");
    }
}
