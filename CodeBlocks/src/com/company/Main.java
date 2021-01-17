package com.company;
import java.math.*;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
		System.out.println(calFeetAndInchesToCentimeters(6, 0));
		System.out.println(calFeetAndInchesToCentimeters(3));
    }

	public static double calFeetAndInchesToCentimeters(double feet, double inches) {
    	if(feet < 0 || inches < 0) {
    		return -1;
		}
    	double feetToCentimeters = feet * 12 * 2.54;
    	double inchesToCentimeters = inches * 2.54;
    	return feetToCentimeters + inchesToCentimeters;
	}

	public static double calFeetAndInchesToCentimeters(double inches) {
		if(inches < 0) {
			return -1;
		}
		double feetInInches = Math.floor(inches / 12);
		double inchesLeft = (int)inches % 12;
		return calFeetAndInchesToCentimeters(feetInInches, inchesLeft);
	}
}





