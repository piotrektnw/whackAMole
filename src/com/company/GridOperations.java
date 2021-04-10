package com.company;

import java.util.Scanner;

public class GridOperations {


    static String[][] populateRandomly(int gridSize, int molesLeft, String[][] moleGrid) {

        // Prepopulate grid with "[*]" - as empty spots
        for (int i = 0; i < gridSize; i++) {
            for (int b = 0; b < gridSize; b++)
                moleGrid[i][b] = "[*]";
        }

        // Populate grid on random positions with "[M]" - as moles
        for (int i = 0; i < molesLeft; i++) {
            double randomPlace = ((Math.random() * (gridSize - 1)) + 1);
            double secondRandomPlace = ((Math.random() * (gridSize - 1)) + 1);
            // Avoid repeated positions
            while (moleGrid[(int) randomPlace][(int) secondRandomPlace] == "[M]") {
                randomPlace = ((Math.random() * (gridSize - 1)) + 1);
                secondRandomPlace = ((Math.random() * (gridSize - 1)) + 1);
                }

            moleGrid[(int) randomPlace][(int) secondRandomPlace] = "[M]";
        }
        return moleGrid;
    }

    // Print grid for user - hidden moles, visible previous attempts
    static void printForUser(int gridSize, String[][] moleGrid) {

        for (int i = 0; i < gridSize; i++) {
            for (int b = 0; b < gridSize; b++) {

                if (moleGrid[i][b] == "[ ]")
                    System.out.print("[ ]");

                else if (moleGrid[i][b] == "[.]")
                    System.out.print("[.]");

                else {
                    System.out.print("[*]");
                }
            }
            System.out.print("\n");
        }
    }

    // Implement whack method
    static String whack(String[][] moleGrid, int gridSize) {

        Scanner whackTry = new Scanner(System.in);
        System.out.print("Place row whack (horizontally in range 1-" + gridSize + "): ");
        int whackOne = whackTry.nextInt();
        // Validate user input
        while (whackOne <= 0 || whackOne > gridSize ) {
            System.out.print("Please enter valid value! Horizontally in range 1-" + gridSize + ": ");
            whackOne = whackTry.nextInt();
        }

        System.out.print("Place column whack (vertically in range 1-" + gridSize + "): ");
        int whackTwo = whackTry.nextInt();
        // Validate user input
        while (whackTwo <= 0 || whackTwo > gridSize) {
            System.out.print("Please enter valid value! Vertically in range 1-" + gridSize + ": ");
            whackTwo = whackTry.nextInt();
        }

        // Set Whack-1 in order to manage indexing from 0
        String whackAttempt = moleGrid[whackOne-1][whackTwo-1];


        switch (whackAttempt) {
            // Update moleGrid
            case "[M]": {
                moleGrid[whackOne - 1][whackTwo - 1] = "[ ]";
                return "hit";
            }
            case "[ ]", "[.]": {
                System.out.println("Already tried!");
            }
            case "[*]": {
                moleGrid[whackOne - 1][whackTwo - 1] = "[.]";
            }
        }

        return " ";
    }
}


