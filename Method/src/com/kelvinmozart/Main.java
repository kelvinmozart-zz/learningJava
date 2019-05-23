package com.kelvinmozart;

public class Main {
    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

        int position = calculateHighScorePosition(1500);
        displayhighScorePosition("Jose", position);

        position = calculateHighScorePosition(900);
        displayhighScorePosition("Maria", position);

        position = calculateHighScorePosition(400);
        displayhighScorePosition("Joao", position);

        position = calculateHighScorePosition(50);
        displayhighScorePosition("Roberta", position);
    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if( gameOver ){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
    public static void displayhighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }
    public static int calculateHighScorePosition(int score){

        if( score >= 1000 ){
            return 1;
        }else if( score >= 500 ){
            return 2;
        }else if( score >= 100 ){
            return 3;
        }

        return 4;
    }
}
