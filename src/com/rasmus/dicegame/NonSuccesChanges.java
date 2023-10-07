package com.rasmus.dicegame;

/* public class FullCode {

    public class Main {

        public static void main(String[] args) {
            ArrayList<Player> players = new ArrayList<>();
            int numDiceRolls = 3;
            int diceSize = 6;

            Game game = new Game(players, numDiceRolls, diceSize);
            game.play();
        }

    }

    public class Game {
    private ArrayList<Player> players;
    private int numDiceRolls;
    private int totalRolls;
    private Random random = new Random();
    private HashMap<String, Integer> playerScores;
    private int currentPlayerIndex;

    public Game(ArrayList<Player> players, int numDiceRolls, int diceSize) {
        this.players = players;
        this.numDiceRolls = numDiceRolls;
        this.totalRolls = numDiceRolls * players.size();
        this.random = new Random();
        this.playerScores = new HashMap<>();
        this.currentPlayerIndex = 0;
    }

    public void play() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to my DiceGame. You can play this game with 2-5 players " +
                "and you can choose to use 1-4 dice during the game.\n" +
                "The game is simple - you will take turns rolling your dice and whoever get the highest score wins.\n" +
                "Please press 'enter' to continue.");
        sc.nextLine();

        while (true) {
            System.out.println("Choose how many players there are. There can only be between" +
                    " 2-5.");
            int playersCount = sc.nextInt();

            if (playersCount >= 2 && playersCount <= 5) {
                initializePlayers(playersCount, sc);
                break;
            } else {
                System.out.println("Please enter a valid option.");
            }
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

        sc.nextLine();

        currentPlayerIndex = 0;

        while (isPlaying()) {
            Player currentPlayer = players.get(currentPlayerIndex);
            String playerName = currentPlayer.getName();

            System.out.println(playerName + ", It's your turn to roll the dice. " +
                    "Press 'Enter'");
            sc.nextLine();

            int diceResult = random.nextInt(dice) + 1;
            int currentScore = playerScores.getOrDefault(playerName, 0);
            currentScore += diceResult;
            playerScores.put(playerName, currentScore);

            System.out.println(playerName + " rolled: " + diceResult);
            System.out.println(playerName + " total points: " + currentScore);
            System.out.println("Press 'Enter' to proceed.");

            if (rollsCount() < totalRolls - 1) {
                sc.nextLine();
            }

            nextPlayer();
        }

        String winner = determineWinner();

        sc.nextLine();

        if (winner != null) {
            System.out.println("The player named: '" + winner +
                    "' won with a total of "+ playerScores.get(winner) + " points!");
        } else {
            System.out.println("It's a draw!");
        }

        sc.close();
    }

    private void initializePlayers(int count, Scanner sc) {
        players.clear();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println("Player " + (i + 1) + ": Choose your name");
            String playerName = sc.nextLine();
            players.add(new Player(playerName));
        }

        totalRolls = numDiceRolls * players.size();
    }

    private boolean isPlaying() {
        return rollsCount() < totalRolls;
    }

    private int rollsCount() {
        return numDiceRolls * currentPlayerIndex;
    }

    private void nextPlayer() {
        currentPlayerIndex++;
        if (currentPlayerIndex >= players.size()) {
            currentPlayerIndex = 0;
        }
    }

    private int rollDice(int dice) {
        int diceResult = random.nextInt(dice) + 1;
        return diceResult;
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

    public class Player implements Comparable<Player> {

        private String name;
        private int score;

        public Player(String name) {
            this.name = name;
            this.score = 0;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        public void addToScore(int points) {
            score += points;
        }

        @Override
        public int compareTo(com.rasmus.dicegame.Player otherPlayer) {
            return Integer.compare(this.score, otherPlayer.score);
        }
    }

    public class Dice {
        private int sides;
        private Random random;

        public Dice (int sides) {
            this.sides = sides;
            this.random = new Random();
        }

        public int roll() {
            return random.nextInt(sides) + 1;
        }
    }


}

 */
