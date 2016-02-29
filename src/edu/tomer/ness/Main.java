package edu.tomer.ness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);


        int[] numbers = {1, 200, 10, 10, 30, 4, -1, 20, 33, 41, 1, 10};
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers.length - 1 - j; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    //swap
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] +", ");
        }

    }
}
