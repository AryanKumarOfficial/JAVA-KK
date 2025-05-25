package com.aryankumarofficial.loopsAndConditions.basic.Logical;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int sum = 0;
            while (true) {
                System.out.print("Enter the number to add: ");
                int n = in.nextInt();
                if (n == 0) {
                    break;
                }
                sum += n;
            }
            System.out.println("Sum: " + sum);
        }
    }
}
