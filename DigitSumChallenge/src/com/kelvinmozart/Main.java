package com.kelvinmozart;

public class Main {

    public static void main(String[] args) {

        for(int i=100; i<=150; i++){
            System.out.println("The sum of the digits in number " + i + " is " + sumDigits(i));
        }
    }

    public static int sumDigits(int number){

        int sum = 0;
        if( number >= 10 ){
            while( number > 0 ){
                int digit = number%10;
                sum += digit;
                number /= 10;
            }
            return sum;
        }else{
            return -1;
        }
    }
}
