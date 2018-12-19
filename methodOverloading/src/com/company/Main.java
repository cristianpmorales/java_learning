package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Cristian ", 500);
        System.out.println(75);
        calculateScore(75);
        calculateScore();
    }
//Over loading a method
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + "points");
        return score * 1000;
    }
    //Using the same method then changing the number of parameters
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + "points");
        return score * 1000;
    }
    //Using a method that has no parameters. As long as the return type is the same
    //then this will work. Changing the return type will create an error
    public static int calculateScore(){
        System.out.println("No name, no player score");
        return 0;
    }
}
