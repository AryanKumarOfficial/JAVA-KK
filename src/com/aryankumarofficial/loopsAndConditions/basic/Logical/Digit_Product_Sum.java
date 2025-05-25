package com.aryankumarofficial.loopsAndConditions.basic.Logical;

import java.util.Scanner;

/**
 * To calculate the sum and product of the digits of a given number
 */
public class Digit_Product_Sum {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int num = in.nextInt();
            int sum = 0;
            int product = 1;
            while (num > 0) {
                int rem = num % 10;
                sum += rem;
                product *= rem;
                num /= 10;
            }
            System.out.println("Sum of the digits is: " + sum);
            System.out.println("Product of the digits is: " + product);
        }
    }

}
