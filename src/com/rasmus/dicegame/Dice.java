package com.rasmus.dicegame;

import java.util.Random;

public class Dice {
    private int sides;
    private Random random;

    // Create Dice of specific type
    public Dice(int sides) {
        this.sides = sides;
        this.random = new Random();
    }

    // Method for rolling the dice and return result
    public int roll() {
        return random.nextInt(sides) + 1;
    }
}