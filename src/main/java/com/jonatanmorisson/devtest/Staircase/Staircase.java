package com.jonatanmorisson.devtest.Staircase;

import java.util.Scanner;

public class Staircase {

    public static void main (String args []){
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.print("int input : ");
        input = sc.nextInt();

        System.out.println(stairCase(input));
    }

    public static String stairCase(Integer line) {
        String result = "";
        // Display left staircase pattern
        for (int row = 0; row < line; row++) {
            for (int col = 0; col < line; col++) {
                if (col < line - row - 1)
                    result = result.concat(" ");
                else
                    result = result.concat("#");
            }
            // Display in a new line
            result = result.concat("\n");
        }
        return result;
    }
}
