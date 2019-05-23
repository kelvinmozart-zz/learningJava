package com.kelvinmozart;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        result++;
        System.out.println("Result is now: " + result);

        boolean isAlien = false;
        if( isAlien == true )
            System.out.println("It is not an alien!");
        else
            System.out.println("It is an alien!");

        int topScore = 80;
        if( topScore < 100 )
            System.out.println("You got the high score!");

        int secondTopScore = 60;
        if( topScore > secondTopScore && topScore < 100 )
            System.out.println("Greater than top score and less then 100");

        if( (topScore > 90) || (secondTopScore <= 90) )
            System.out.println("One of these tests is true\n\n");


        double firstValue = 20d;
        double secondValue = 80d;
        double totalValue = (firstValue + secondValue) * 25d;
        double theRemainder = totalValue % 40;
        if( theRemainder <= 20 )
            System.out.println("Total was over the limit");
    }
}
