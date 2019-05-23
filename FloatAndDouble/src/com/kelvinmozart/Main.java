package com.kelvinmozart;

public class Main {

    public static void main(String[] args) {

        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 2;
        // width of float = 32 (4 bytes)
	    float myFloatValue = 5f / 2f;
	    // width of double = 64 (4 bytes)
	    double myDoubleValue = 5d / 2d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double pounds = 170d;
        double kilograms = pounds * 0.45359237d;

        System.out.println(pounds + " pounds is equal to " + kilograms + " kg");
    }
}
