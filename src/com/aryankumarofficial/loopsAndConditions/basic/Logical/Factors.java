package com.aryankumarofficial.loopsAndConditions.basic.Logical;

import java.util.Scanner;

/**
 * Print all the factors of the number
 */
public class Factors {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int num = in.nextInt();
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
