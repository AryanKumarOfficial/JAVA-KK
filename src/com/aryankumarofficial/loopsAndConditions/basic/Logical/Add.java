package com.aryankumarofficial.loopsAndConditions.basic.Logical;

import java.util.Scanner;

/**
 * Sum of the two numbers
 */
public class Add {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int a = in.nextInt();
            System.out.print("Enter second number: ");
            int b = in.nextInt();

            int sum = a + b;
            System.out.println("Sum of the two numbers is: " + sum);
        }
    }
}
