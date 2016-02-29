package edu.tomer.ness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n (Matrix size):");
        int n = scanner.nextInt();

        String[][] starsMatrix = new String[n][n];

        int counter = 1;
        for (int i = 0; i < starsMatrix.length; i++) {
            for (int j = 0; j < starsMatrix[i].length; j++) {
                starsMatrix[i][j] = "" + counter++;
                System.out.printf("%-4s", starsMatrix[i][j]);
            }
            System.out.println();
        }




    }
}
