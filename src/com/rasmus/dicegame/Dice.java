package com.rasmus.dicegame;

import java.util.Random;

// Dice mechanics only for checking in test
// Was supposed to hold dice for game initially but isn't due to lack of time

public class Dice {
    private int sides;
    private Random random;

    // Create Dice of specific type
    public Dice(int sides) {
        this.sides = sides;
        this.random = new Random();
    }

    // Method for rolling dice and return correct result in gameTest
    public int roll() {
        return random.nextInt(sides) + 1;
    }
}