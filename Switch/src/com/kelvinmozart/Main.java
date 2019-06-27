package com.kelvinmozart;

import javax.xml.bind.annotation.XmlType;

public class Main {

    public static void main(String[] args) {

        int value = 1;

        switch (value){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char letter = 'D';

        switch (letter){
            case 'A':
                System.out.println("Letter A was found");
                break;
            case 'B':
                System.out.println("Letter B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Letter was " + letter + " found");
                break;
            default:
                System.out.println("Letter not found");
                break;
        }
    }
}
