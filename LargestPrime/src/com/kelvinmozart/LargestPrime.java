package com.kelvinmozart;

public class LargestPrime{

    public static int getLargestPrime(int number){

        if( number <= 1 ){
            return -1;
        }else{
            int divisor = 2;

            while( number != 1 ){
                if( number%divisor == 0 ){
                    number /= divisor;
                }else{
                    divisor++;
                }
            }
            return divisor;
        }
    }
}
