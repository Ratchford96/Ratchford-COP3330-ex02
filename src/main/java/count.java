/*
 * UCF COP3330 Summer 2021 Assignment 1 Solution
 * Copyright 2021 Joseph Ratchford
 */

import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        // here we want to declare our variable
        String word;

        Scanner input = new Scanner(System.in);
        // here we tell the program to input the string

        System.out.print("What is the input string? \n");
        String str = input.nextLine();

        int count = 0;
        // this is where we use a for loop to get the number of characters
        for (int i = 0; i < str.length(); i++) {
             {
                count++;


            }
            // this is where the character print out
            System.out.println(count);
            System.out.println(str + " has " + count + " characters");
        }


    }
}

