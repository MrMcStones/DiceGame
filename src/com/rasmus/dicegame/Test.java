package com.rasmus.dicegame;

import java.util.Random;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numDiceRolls = 3;

        System.out.println("Welcome to my DiceGame. You can play this game with 2-5 players " +
                "and you can choose to use 1-4 dice during the game.\n" +
                "The game is simple - you will take turns rolling your dice and whoever gets the highest score wins.\n" +
                "Please press 'enter' to continue.");
        sc.nextLine();

        int players;

        while (true) {
            System.out.println("Choose how many players there are. There can only be between" +
                    " 2-5.");
            players = sc.nextInt();

            if (players >= 2 && players <= 5) {
                break;
            } else {
                System.out.println("Please enter a valid option.");
            }
        }

        Player[] playersArray = new Player[players];

        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i + 1) + ": Choose your name");
            String playerName = sc.next();
            playersArray[i] = new Player(playerName);
        }

        int dice;
        while (true) {
            System.out.println("How many dice do you want to play with? Must be between 1-4.");
            dice = sc.nextInt();

            if (dice >= 1 && dice <= 4) {
                break;
            } else {
                System.out.println("Please enter a valid option.");
            }
        }

        int diceSize;
        while (true) {
            System.out.println("Choose which sided dice you want to use. The options are: 6, 12 or 20");
            diceSize = sc.nextInt();

            if (diceSize == 6 || diceSize == 12 || diceSize == 20) {
                break;
            } else {
                System.out.println("Please enter a valid option");
            }
        }

        sc.nextLine();

        int totalRolls = numDiceRolls * playersArray.length;
        int rollsCount = 0;
        boolean isPlaying = true;
        int currentPlayerIndex = 0;

        while (isPlaying && rollsCount < totalRolls) {
            Player currentPlayer = playersArray[currentPlayerIndex];
            String playerName = currentPlayer.getName();

            System.out.println(playerName + ", It's your turn to roll the dice. " +
                    "Press 'Enter'");
            sc.nextLine();

            int diceResult = random.nextInt(diceSize) + 1;
            System.out.println(playerName + " rolled: " + diceResult);

            rollsCount++;

            if (rollsCount == totalRolls) {
                isPlaying = false;
            } else {
                System.out.println("Next player press 'Enter' to roll.");
                sc.nextLine();
                currentPlayerIndex++;

                if (currentPlayerIndex >= playersArray.length) {
                    currentPlayerIndex = 0;
                }
            }
        }

        System.out.println("Det var det.");

    }
}

