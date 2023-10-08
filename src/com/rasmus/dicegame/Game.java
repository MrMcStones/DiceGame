package com.rasmus.dicegame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private static String determineWinner;
    private ArrayList<Player> players;
    private HashMap<String, Integer> playerScores;
    private int diceSize;
    private int currentPlayerIndex;
    private int diceCount;
    private int roundsPlayed;

    public Game(ArrayList<Player> players, int diceCount, int diceSize) {
        this.players = players;
        this.diceSize = diceSize;
        this.playerScores = new HashMap<>();
        this.currentPlayerIndex = 0;
        this.diceCount = diceCount;
        this.roundsPlayed = 0;
    }

    public void play() {
        Scanner sc = new Scanner(System.in);

        int chosenDiceCount = diceCount;
        int maxRounds = 3;

        while (roundsPlayed < maxRounds) {
            for (Player player : players) {
                Player currentPlayer = players.get(currentPlayerIndex);
                String playerName = currentPlayer.getName();

                System.out.println(playerName + ", It's your turn to roll the dice. " +
                        "Press 'Enter'");
                sc.nextLine();

                int numDiceToRoll = chosenDiceCount;
                int totalScore = 0;

                ArrayList<Integer> diceResults = rollDice(diceSize, numDiceToRoll);
                for (int i = 0; i < numDiceToRoll; i++) {
                    int diceResult = diceResults.get(i);
                    String diceLabel = (numDiceToRoll > 1) ? "Dice " + (i + 1) + ": " : "";
                    System.out.println(playerName + " rolled " + diceLabel + diceResult);
                    totalScore += diceResult;
                }

                int currentScore = playerScores.getOrDefault(playerName, 0);
                currentScore += totalScore;
                playerScores.put(playerName, currentScore);

                System.out.println(playerName + " total points: " + currentScore);
                System.out.println();

                currentPlayerIndex++;

                if (currentPlayerIndex >= players.size()) {
                    currentPlayerIndex = 0;
                }
            }

            roundsPlayed++;
        }

        System.out.println("Press 'Enter' to proceed.");

        String winner = determineWinner();
        sc.nextLine();

        if (winner != null) {
            System.out.println("The player named '" + winner +
                    "' won with a total of "+ playerScores.get(winner) + " points!");
            System.out.println();
        } else {
            System.out.println("It's a draw!");
            System.out.println();
        }

        System.out.println("Thank you for playing!");
        System.out.println("Press 'Enter' to exit the game.");
        sc.nextLine();
        sc.close();
    }

    private ArrayList<Integer> rollDice(int dice, int numDice) {
        ArrayList<Integer> results = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numDice; i++) {
            int diceResult = random.nextInt(dice) + 1;
            results.add(diceResult);
        }

        return results;
    }

    private String determineWinner() {
        String winner = null;
        int highestScore = Integer.MIN_VALUE;

        for (String playerName : playerScores.keySet()) {
            int playerScore = playerScores.get(playerName);
            if (playerScore > highestScore) {
                winner = playerName;
                highestScore = playerScore;
            }
        }

        return winner;
    }
}