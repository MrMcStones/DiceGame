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
        Player players = new Player("", 0, 0);
        Player player1 = new Player("", 0,0);
        Player player2 = new Player("", 0,0);

        System.out.println("Enter how many players will compete:");
        players.user = sc.nextInt();
        System.out.println("Enter how many dice you want to throw every round:");
        players.die = sc.nextInt();

        System.out.println("Player 1 name:");
        player1.name = sc.next();
        System.out.println("Player 2 name:");
        player2.name = sc.next();
    }
}

// Checklist
/* Checklist
Scanner DONE - FIX into separate class
Player clas DONE - constructor DONE
Ask how many players DONE
Ask how many die DONE
FIX if or switch case for answer regarding players and die
 */
