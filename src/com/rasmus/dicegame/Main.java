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

// TODO
/* TODO
Amount of players - VG
Amount of dice
Player Name

RULES
Every player gets to throw one or more dice per turn
The player with the highest score wins (minimum 2 players)

VG

Two winners, handle that
Scanner in its own class
Make sure the right answer through input
Name can only be 'String'
Number can only be 'Integer'
Three relevant unit testings
 */