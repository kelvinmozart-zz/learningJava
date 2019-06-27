package com.kelvinmozart;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(12650));

    }
    private static String getDurationString(int minutes, int seconds){
        if( minutes >= 0 && seconds >= 0 && seconds < 60 ){
            int hours = minutes/60;
            //int remainingMinutes = minutes%60;
            return hours + "h " + minutes%60 + "m " + seconds + "s";
        }
        return "Invalid value";
    }
    private static String getDurationString(int seconds){
        if( seconds >= 0 ){
             int minutes = seconds/60;
             int remainingSeconds = seconds%60;
             return getDurationString(minutes, remainingSeconds);
        }
        System.out.println();
        return "Invalid value";
    }
}
