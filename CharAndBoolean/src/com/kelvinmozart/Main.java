package com.kelvinmozart;

public class Main {

    public static void main(String[] args) {

        // width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode output: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        myChar = '\u00AE';
        System.out.println("New Unicode output: " + myChar);
    }
}
