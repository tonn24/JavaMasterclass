package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        int maxValue = 214_748_368;

        System.out.println(maxValue);
        System.out.println("Integer Minimum Value = " + myMinIntValue + "Integer max value = " + myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte min value is " + myMinByteValue + " and byte max value is " + myByteMaxValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min value is " + myMinShortValue + " and short max value is " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("long min value is " + myMinLongValue + " and long max value is " + myMaxLongValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println(myNewByteValue);

        short myNewShortValue = (short)(myMinShortValue / 2);

        byte nr23 = 23;
        short nr2345 = 2345;
        int nr456 = 456;
        long nr = 50000 + (10*(nr23 + nr2345 + nr456));

    }
}
