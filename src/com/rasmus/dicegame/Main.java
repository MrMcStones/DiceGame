package com.rasmus.dicegame;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        UserInterface.welcomeMessage();

        //Read number of players
        int playerCount = UserInterface.readPlayerCount();
        //Create player objects
        ArrayList<Player> players = UserInterface.createPlayers(playerCount);

        // Read number of dice
        int diceCount = UserInterface.readDiceCount();
        // Read type of dice
        int diceSize = UserInterface.readDiceSize();

        // Initialize the game
        Game game = new Game(players, diceCount, diceSize);
        game.play();
    }
}