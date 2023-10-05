package com.rasmus.dicegame;

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
        Player player1 = new Player();

        System.out.println("Enter how many players will compete");
        System.out.println("Enter how many dice you want to throw every round");


        System.out.println("Player 1 name:");
        System.out.println("Player 2 name:");
    }
}
