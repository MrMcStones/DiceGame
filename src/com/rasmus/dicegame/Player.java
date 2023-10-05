package com.rasmus.dicegame;

public class Player {

    private static Player[] playersArray;

    private static void setPlayersArray(Player[] players) {
        playersArray = players;
    }
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

    public void setScore (int score) {
        this.score = score;
    }
}
