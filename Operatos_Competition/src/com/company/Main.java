package com.company;

public class Main {

    public static void main(String[] args) {

    double numero = 80.0;
    double numero1 = 20.0;

    double variabile = (numero + numero1) * 100.0d;

    System.out.println(variabile);

    double resto = variabile % 40.0d;

    //booleanExpression ? expression1 : expression2

    boolean buli = resto != 0;

    System.out.println(buli);

    String messaggio = buli ? "C'è del resto" : "Non c'è resto";

    System.out.println(messaggio + "\n");


    System.out.println(rest(20,10));

    int punteggio = calculateHighScorePosition(499);

    displayHighScorePosition("Mario", punteggio);

    }

    public static void displayHighScorePosition(String playerName, int position){
        //position in the high score table
        System.out.println(playerName + " managed to be at position: " + position + " on the high score table!");
    }

    public static int calculateHighScorePosition(int score){

        if (score >= 1000){
            return 1;
        }else{
            if (score >= 500) {
                return 2;
            }else{
                if (score >= 100){
                    return 3;
                }else{
                    return 4;
                }
            }
        }
    }

    static boolean rest(int value1, int value2){
        return value1 % value2 == 0;
    }
}
