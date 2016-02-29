package edu.tomer.ness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = { {1, 2, 3, 1, 10},
                        {4, 5, 6, 2},
                        {7, 8, 9} };

        /*
        int[] a = arr[0]; // {1, 2, 3}


        //aside
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print(i == a.length - 1 ? "": ", ");
        }
*/



        for (int rows = 0; rows < arr.length; rows++) {
            for (int col = 0; col < arr[rows].length; col++) {
                System.out.print(arr[rows][col]);
                System.out.print(col == arr[rows].length - 1 ?"\n" : ", ");
            }
        }

        int[][] multTable = new int[10][10];
//
        multTable[0][0] = 1;
        for (int i = 0; i < multTable.length; i++) {
            for (int j = 0; j < multTable[i].length; j++) {
                multTable[i][j] = (i + 1) * (j + 1);
                //System.out.print(multTable[i][j]);
                System.out.printf("%-4d", multTable[i][j]);
            }
            System.out.println();
        }

        String name = "Tomer";
        String language = "Java";
        System.out.printf("Your name is: %s and your language is %s",name, language);

    }
}
