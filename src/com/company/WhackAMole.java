package com.company;

import java.util.Scanner;

public class WhackAMole {
    int[] collection = collectLevel(2);
    int attemptsLeft = collection[0];
    int molesLeft = collection[1];

    // Is it allowed to collect different variables in different methods?
    // What is more efficient way?
    static int collectSize() {
        Scanner collectInput = new Scanner(System.in);
        int size = 0;

        // Hardcoded values on purpose
        while (size < 3 || size > 6) {
            System.out.print("Enter size of a grid (min: 3, max: 6): ");
            size = collectInput.nextInt();
        }
        return size;
    }

    static int[] collectLevel(int size) {
        Scanner collectInput = new Scanner(System.in);
        int [] collection = new int[2];
        int level = 0;

        while (level < 1 || level > 3) {
            System.out.print("Choose difficulty level (1-3): ");
            level = collectInput.nextInt();
        }

        if (level == 1) {
            collection[0] = 8;  // collection[0] = attemptsLeft
            collection[1] = 1;  // collection[1] = molesLeft
        } else if (level == 2) {
            collection[0] = 8;
            collection[1] = 2;
        } else {
            collection[0] = 8;
            collection[1] = 3;
        }
        /*
            What about HashMap with string access
            (e.g. sampleHashMap.get("attemptsLeft")) instead of collection[][]?
         */
        return collection;
    }
}

