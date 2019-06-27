package com.kelvinmozart;

public class GreatestCommonDivisor{

    public static int getGreatestCommonDivisor(int first, int second){

        if( first < 10 || second < 10 ){
            return -1;
        }
        int divisor = 0;
        int min = Math.min(first, second);
        int max = Math.max(first, second);

        for (int i=min; i>0; i--){
            if( min%i == 0 ){
                divisor = i;
                if( max%i == 0 ){
                    break;
                }
            }
        }
        return divisor;
    }
}
