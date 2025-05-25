package com.aryankumarofficial.loopsAndConditions.basic.Logical;

import java.util.Scanner;

/**
 * To get the input from the user until receives 0 and print the largest among them
 */
public class LargestOfAll {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int largest = 0;
            while (true) {
                System.out.print("Enter the number: ");
                int n = in.nextInt();
                if (n == 0) break;
                if (n > largest) largest = n;
            }
            System.out.println("Largest among all is: " + largest);
        }
    }
}
