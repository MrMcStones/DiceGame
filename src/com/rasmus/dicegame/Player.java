package com.rasmus.dicegame;

public class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addToScore(int points) {
        score += points;
    }

    /* private static Player[] playersArray;

    private static void setPlayersArray(Player[] players) {
        playersArray = players;
    }

    public void setScore (int score) {
        this.score = score;
    }

     */
}