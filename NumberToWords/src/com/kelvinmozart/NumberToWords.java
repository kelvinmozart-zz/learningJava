package com.kelvinmozart;

public class NumberToWords{

    public static void numberToWords(int number){

        if( number < 0 ){
            System.out.println("Invalid Value");
        }else if( number == 0 ){
            System.out.println("Zero");
        }else{
            int reverse = reverseNumber(number);
            int count = getDigitCount(number) - getDigitCount(reverse);

            while( reverse > 0 ){
                int lastDigit = reverse%10;
                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }reverse /= 10;
            }
            if( count >= 1 ){
                for(int i=0; i<count; i++){
                    System.out.println("Zero");
                }
            }
        }
    }

    private static int reverseNumber(int number) {
        int reversedNumber = 0;
        boolean isNegative = number < 0;

        if (isNegative) {
            number = -number;
        }

        while (number >= 1) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        return isNegative ? reversedNumber * -1 : reversedNumber;
    }

    public static int getDigitCount (int number) {
        int digitCount = 1;
        if (number < 0) return -1;
        else {
            while (number > 9) {
                number /= 10;
                digitCount++;
            }
        }
        return digitCount;
    }
}
