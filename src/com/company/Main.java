package com.company;


public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to WhackAMole - find hidden moles in grid of your choice.");
        // Access whackAMole class and its variables and methods
        WhackAMole whackAMole = new WhackAMole();
        int molesLeft = whackAMole.molesLeft;
        int attemptsLeft = whackAMole.attemptsLeft;
        int scoreToGet = whackAMole.collection[1];
        int gridSize = WhackAMole.collectSize();

        // Declare score and moleGrid of chosen size
        int score = 0;
        String[][] moleGrid = new String[gridSize][gridSize];

        // Populate, access populatedRandomly grid for end game print
        String[][] populatedGrid = GridOperations.populateRandomly(gridSize, molesLeft, moleGrid);

        while (true){
            // Print basic info for user
            System.out.println("You have " + attemptsLeft + " attempts left.\n" +
                            "Moles left: " + molesLeft + ".\nCurrent score: " +
                            score);

            // Print current grid status
            // How to print it 'on demand' anytime user types fixed input?
            GridOperations.printForUser(gridSize, moleGrid);

            // Check user input
            if (GridOperations.whack(populatedGrid, gridSize) == "hit") {
            System.out.println("Scored!");
            score++;
            molesLeft--;
            }

            else {
                System.out.println("Missed.");
                attemptsLeft--;
            }

            // End game if score reached
            if (score == scoreToGet) {
                System.out.println("You Won!");
                break;
            }

            // End game if no attempts left
            else if (attemptsLeft == 0) {
                System.out.println("You lost!");
                break;
            }
        }

        // Show grid
        PrintGrid.printMoleGrid(gridSize, populatedGrid);
    }
}
