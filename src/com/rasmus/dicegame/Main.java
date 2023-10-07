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
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        HashMap<String, Integer> playerScores = new HashMap<>();
        int numDiceRolls = 3;

        System.out.println("""
                Welcome to my DiceGame. You can play this game with 2-5 players and you can choose to use 1-4 dice during the game.
                The game is simple - you will take turns rolling your dice and whoever get the highest score wins.
                Please press 'enter' to continue.""");
        sc.nextLine();

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

        ArrayList<Player> players = new ArrayList<>();

        for (int i = 0; i < playerCount; i++) {
            System.out.println("Player " + (i + 1) + ": Choose your name");
            String playerName = sc.next();
            players.add(new Player(playerName));
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

        int totalRolls = numDiceRolls * playerCount;
        int rollsCount = 0;
        boolean isPlaying = true;
        int currentPlayerIndex = 0;

        ArrayList<Integer> diceRollResult = new ArrayList<>();

        while (isPlaying && rollsCount < totalRolls) {
            Player currentPlayer = players.get(currentPlayerIndex);
            String playerName = currentPlayer.getName();

            System.out.println(playerName + ", It's your turn to roll the dice. " +
                    "Press 'Enter'");
            sc.nextLine();

            int diceResult = random.nextInt(diceSize) + 1;
            int currentScore = playerScores.getOrDefault(playerName, 0);
            currentScore += diceResult;
            playerScores.put(playerName, currentScore);

            System.out.println("You rolled: " + diceResult);
            diceRollResult.add(diceResult);
            System.out.println(playerName + " total points: " + currentScore);
            System.out.println("Press 'Enter' to proceed.");

            if (rollsCount < totalRolls - 1) {
                sc.nextLine();
            }

            rollsCount++;

            currentPlayerIndex++;

            if (currentPlayerIndex >= playerCount) {
                currentPlayerIndex = 0;
            }

            if (rollsCount == totalRolls) {
                isPlaying = false;
            }
        }

        String winner = null;
        int highestScore = Integer.MIN_VALUE;

        for (Player player : players) {
            int playerScore = playerScores.get(player.getName());
            if (playerScore > highestScore) {
                winner = player.getName();
                highestScore = playerScore;
            }
        }

        sc.nextLine();

        if (winner != null) {
            System.out.println("The player named '" + winner +
                    "' won with a total of "+ highestScore + " points!");
        } else {
            System.out.println("It's a draw!");
        }

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
 */
