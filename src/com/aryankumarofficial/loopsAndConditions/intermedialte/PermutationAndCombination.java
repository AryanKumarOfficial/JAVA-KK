package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.util.Scanner;

public class PermutationAndCombination {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter n:");
            double n = sc.nextDouble();
            System.out.println("Enter r:");
            double r = sc.nextDouble();
            double nPr = calculateNPr(n, r);
            double nCr = calculateNCr(n, r);
            System.out.println("Permutation is: " + nPr);
            System.out.println("Combination is: " + nCr);
        }
    }

    private static double calculateNCr(double n, double r) {

        return calculateFactorial(n) / (calculateFactorial(r) * calculateFactorial(n - r));
    }

    private static double calculateNPr(double n, double r) {
        return calculateFactorial(n) / calculateFactorial(n - r);
    }

    private static double calculateFactorial(double n) {
        if (n == 0 | n == 1) return 1;
        return n * calculateFactorial(n - 1);
    }
}
