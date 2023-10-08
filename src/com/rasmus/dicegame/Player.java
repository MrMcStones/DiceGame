package com.rasmus.dicegame;

public class Player {
    private String name;
    private int score;

    // Create Player object with name and start score of 0
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    // Adds point to player score
    public void addToScore(int points) {
        score += points;
    }
}