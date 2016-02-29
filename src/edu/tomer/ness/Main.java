package edu.tomer.ness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to search:");
        int query = scanner.nextInt();

        int[] numbers = {1, 12, 13, 14, 15, 66,99, 100,101};

        int firstIdx = 0;
        int lastIdx = numbers.length - 1; //the index of the last term

        int queryIdx = -1;
        while (firstIdx <= lastIdx){
            int middle = (firstIdx + lastIdx) / 2;
            if (numbers[middle] == query){
                queryIdx = middle;
                break;
            }else if (query > numbers[middle]){
                firstIdx = middle + 1;
            }
            else {
                lastIdx = middle - 1;
            }
        }

        System.out.println(queryIdx);
    }
}
