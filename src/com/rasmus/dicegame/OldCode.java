package com.rasmus.dicegame;

public class OldCode {

            /* OLD SETUP BEFORE CHANGING CLASSES STRUCTURE
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        HashMap<String, Integer> playerScores = new HashMap<>();
        int numDiceRolls = 3;

        System.out.println("Welcome to my DiceGame. You can play this game with 2-5 players " +
                "and you can choose to use 1-4 dice during the game.\n" +
                "The game is simple - you will take turns rolling your dice and whoever get the highest score wins.\n" +
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

        ArrayList<Integer> diceRollResult = new ArrayList<>();

        while (isPlaying && rollsCount < totalRolls) {
            Player currentPlayer = playersArray[currentPlayerIndex];
            String playerName = currentPlayer.getName();

            System.out.println(playerName + ", It's your turn to roll the dice. " +
                    "Press 'Enter'");
            sc.nextLine();

            int diceResult = random.nextInt(diceSize) + 1;
            int currentScore = playerScores.getOrDefault(playerName, 0);
            currentScore += diceResult;
            playerScores.put(playerName, currentScore);

            System.out.println(playerName + " rolled: " + diceResult);
            diceRollResult.add(diceResult);
            System.out.println(playerName + " total points: " + currentScore);
            System.out.println("Press 'Enter' to proceed.");

            if (rollsCount < totalRolls - 1) {
                sc.nextLine();
            }

            rollsCount++;

            currentPlayerIndex++;

            if (currentPlayerIndex >= playersArray.length) {
                currentPlayerIndex = 0;
            }

            if (rollsCount == totalRolls) {
                isPlaying = false;
            }
        }

        String winner = null;
        int highestScore = Integer.MIN_VALUE;

        for (String playerName : playerScores.keySet()) {
            int playerScore = playerScores.get(playerName);
            if (playerScore > highestScore) {
                winner = playerName;
                highestScore = playerScore;
            }
        }

        sc.nextLine();

        if (winner != null) {
            System.out.println("The player named: '" + winner +
                    "' won with a total of "+ highestScore + " points!");
        } else {
            System.out.println("It's a draw!");
        }

        sc.close();

         */
}
