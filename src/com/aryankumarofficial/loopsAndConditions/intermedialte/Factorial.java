package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.util.Scanner;

/**
 * Factorial program in JAVA
 */
public class Factorial {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double factorial = 1;
            System.out.print("Enter the number to obtain factorial: ");
            int n = in.nextInt();
            if (n == 0) {
                System.out.println(factorial);
                return;
            }
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        }
    }
}
