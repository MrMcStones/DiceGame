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

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Player player1 = new Player("");
        Player player2 = new Player("");
        Player player3 = new Player("");
        Player player4 = new Player("");
        Player player5 = new Player("");

        int players;

        while (true) {
            System.out.println("Choose how many players there are. There can only be between" +
                    " 2-5.");
            players = sc.nextInt();

            if (players >= 2 && players <= 5) {
                break;
            } else {
                System.out.println("There can only be between 2-5 players. " +
                        "Please enter a valid option.");
            }
        }

        Player[] playersArray = new Player[players];

        for (int i = 0; i < players; i++) {
            System.out.println("Choose your names:" + (i + 1) + ": ");
            String playerName = sc.next();
            playersArray[i] = new Player(playerName);
        }

        int dice;
        while (true) {
            System.out.println("How many dice do you want to play with? Must be between 1-4.");
            dice = sc.nextInt();

            if (dice >= 1 && dice <=4) {
                break;
            } else {
                System.out.println("You can only choose between 1-4 dice. " +
                        "Please enter a valid option.");
            }
        }

        }
    }

// Checklist
/* Checklist
Scanner DONE - FIX into separate class
Player class DONE - constructor DONE  - FIX Fill out later
Dice class DONE - FIX Fill out later
Ask how many players DONE
Ask how many die DONE
DONE ask for player names - FIX finnish and look if best way
 */
