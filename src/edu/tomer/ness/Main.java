package edu.tomer.ness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //This is the array we need to search
        int[] numbers = {100, 31, 10, 0, 1, 19};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to search in the array:");
        int num = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num){
                index = i;
                break;
            }
        }
        System.out.println("The index of num is: " + index);
    }
}
