package com.rasmus.dicegame;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Welcome message with instructions
        System.out.println("""
                Welcome to my DiceGame. You can play this game with 2-5 players and you can choose to use 1-4 dice during the game.
                The game is simple - you will take turns rolling your dice, and whoever gets the highest score wins.
                Please press 'enter' to continue.""");
        sc.nextLine();

        //Read number of players
        int playerCount = readPlayerCount(sc);
        //Create player objects
        ArrayList<Player> players = createPlayers(sc, playerCount);

        // Read number of dice
        int diceCount = readDiceCount(sc);
        // Read type of dice
        int diceSize = readDiceSize(sc);

        // Initialize the game
        Game game = new Game(players, diceCount, diceSize);
        game.play();
    }

    // Method to read number of players
    private static int readPlayerCount(Scanner sc) {
        int playerCount;

        while (true) {
            try {
                System.out.println("Choose how many players there are. There can only be between" +
                        " 2-5.");
                playerCount = sc.nextInt();

                if (playerCount >= 2 && playerCount <= 5) {
                    break;
                } else {
                    System.out.println("Please enter a valid option.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid option.");
                sc.nextLine();
            }
        }

        return playerCount;
    }

    // Method to create player objects
    private static ArrayList<Player> createPlayers(Scanner sc, int playerCount) {
        ArrayList<Player> players = new ArrayList<>();

        for (int i = 0; i < playerCount; i++) {
            try {
                System.out.println("Player " + (i + 1) + ": Choose your name");
                String playerName = sc.next();
                players.add(new Player(playerName));
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid option.");
                sc.nextLine();
                i--;
            }
        }

        return players;
    }

    // Method to read number of dice
    private static int readDiceCount(Scanner sc) {
        int diceCount;

        while (true) {
            try {
                System.out.println("How many dice do you want to play with? Must be between 1-4.");
                diceCount = sc.nextInt();

                if (diceCount >= 1 && diceCount <= 4) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid option.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid option.");
                sc.nextLine();
            }
        }

        return diceCount;
    }

    //Method to read type of dice
    private static int readDiceSize(Scanner sc) {
        int diceSize;

        while (true) {
            try {
                System.out.println("Choose which sided dice you want to use. The options are: 6, 12, or 20");
                diceSize = sc.nextInt();

                if (diceSize == 6 || diceSize == 12 || diceSize == 20) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid option.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid option.");
                sc.nextLine();
            }
        }

        return diceSize;
    }
}

// Checklist
/*
FIX
Scanner into separate class
Comment more?
 */

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