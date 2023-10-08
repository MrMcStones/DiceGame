package com.rasmus.test;

import com.rasmus.dicegame.Dice;
import com.rasmus.dicegame.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class gameTest {

    @Test
    public void testRoll() {
        Dice dice = new Dice(6);

        for (int i = 0; i < 1000; i++) {
            int result = dice.roll();
            assertTrue(result >= 1 && result <= 6, "Result should be between 1-6");
        }
    }

    @Test
    public void testAddToScore() {
        Player player = new Player("Player1");
        player.addToScore(10);

        int expectedScore = 10;

        assertEquals(expectedScore, player.getScore(), "Player's score should increase by 10");
    }

    @Test
    public void testGetName() {
        Player player = new Player("Player1");
        String expectedName = "Player1";

        assertEquals(expectedName, player.getName(), "Player's name should be correct.");
    }
}