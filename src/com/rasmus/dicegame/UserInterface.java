package com.rasmus.dicegame;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    private static final Scanner sc = new Scanner(System.in);

    public static void welcomeMessage() {
        // Welcome message with instructions
        System.out.println("""
                Welcome to my DiceGame. You can play this game with 2-5 players and you can choose to use 1-4 dice during the game.
                The game is simple - you will take turns rolling your dice, and whoever gets the highest score wins.
                Please press 'enter' to continue.""");
        sc.nextLine();

    }

    // Method to read number of players
    public static int readPlayerCount() {
        int playerCount = 0;

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
    public static ArrayList<Player> createPlayers(int playerCount) {
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
    public static int readDiceCount() {
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
    public static int readDiceSize() {
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
