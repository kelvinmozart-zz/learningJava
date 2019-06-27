package com.kelvinmozart;

public class SharedDigit{
    public static boolean hasSharedDigit(int numberOne, int numberTwo){

        if( numberOne < 10 || numberOne > 99 || numberTwo < 10 || numberTwo > 99 ){
            return false;
        }
        int x = numberOne%10;
        int y = numberOne/10;
        int j = numberTwo%10 ;
        int k = numberTwo/10;
        return (x == j) || (x==k) || y == j || y==k ;
    }
}
