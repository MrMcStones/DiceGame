package com.rasmus.dicegame;

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

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Welcome to my DiceGame. You can play this game with 2-5 players and you can choose to use 1-4 dice during the game.
                The game is simple - you will take turns rolling your dice, and whoever gets the highest score wins.
                Please press 'enter' to continue.""");
        sc.nextLine();

        int playerCount = readPlayerCount(sc);
        ArrayList<Player> players = createPlayers(sc, playerCount);

        int diceCount = readDiceCount(sc);

        int diceSize = readDiceSize(sc);

        Game game = new Game(players, diceCount, diceSize);
        game.play();
    }

    private static int readPlayerCount(Scanner sc) {
        int playerCount;

        while (true) {
            System.out.println("Choose how many players there are. There can only be between" +
                    " 2-5.");
            playerCount = sc.nextInt();

            if (playerCount >= 2 && playerCount <= 5) {
                break;
            } else {
                System.out.println("Please enter a valid option.");
            }
        }

        return playerCount;
    }

    private static ArrayList<Player> createPlayers(Scanner sc, int playerCount) {
        ArrayList<Player> players = new ArrayList<>();

        for (int i = 0; i < playerCount; i++) {
            System.out.println("Player " + (i + 1) + ": Choose your name");
            String playerName = sc.next();
            players.add(new Player(playerName));
        }

        return players;
    }

    private static int readDiceCount(Scanner sc) {
        int diceCount;

        while (true) {
            System.out.println("How many dice do you want to play with? Must be between 1-4.");
            diceCount = sc.nextInt();

            if (diceCount >= 1 && diceCount <= 4) {
                break;
            } else {
                System.out.println("Please enter a valid option.");
            }
        }

        return diceCount;
    }

    private static int readDiceSize(Scanner sc) {
        int diceSize;

        while (true) {
            System.out.println("Choose which sided dice you want to use. The options are: 6, 12, or 20");
            diceSize = sc.nextInt();

            if (diceSize == 6 || diceSize == 12 || diceSize == 20) {
                break;
            } else {
                System.out.println("Please enter a valid option");
            }
        }

        return diceSize;
    }
}

// Checklist
/*
DONE
Make Scanner
Make player class - constructor
Make dice class
Ask how many players
Ask how many dice
Ask for player names DONE
Make players being able to roll
Make players take turns rolling
Save score of rolls
Tabulate players rolls for total scoring
Show winner
Make 'else' for a draw scenario

FIX
Scanner into separate class
Comment code
Make use of classes (OOP) - Scanner, players, dice etc.
UnitTesting
Exception handling - Try Catch

I detta spela vill jag att spelarna ska mötas av en introtext. De ska sedan få välja antalet spelare. Sedan skriva in sina namn. Sedan välja antalet tärningar som ska kastas varje omgång. Sedan välja vilken typ av tärning/tärningar som ska kastas. Sedan ska spelare ett får kasta antalet valda tärningar och resultatet för det kastet samt spelarens totala poäng ska visas upp. Sedan ska nästa spelare få kasta. Detta ska upprepas tre gånger. Sedan ska vinnaren räknas ut och visas upp innan spelet avslutas.
 */
