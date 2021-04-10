package com.company;

public class PrintGrid {

    public static void printMoleGrid(int gridSize, String[][] moleGrid) {

        for (int i = 0; i < gridSize; i++){
            for (int b = 0; b < gridSize; b++) {
                System.out.print(moleGrid[i][b]);
            }
            System.out.print("\n");
        }
    }
}

