package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the principal amount:");
            double principal = sc.nextDouble();
            System.out.println("Enter the rate of interest applied annually:");
            double rate = sc.nextDouble();
            System.out.println("Enter the time period in years:");
            int time = sc.nextInt();
            double ci = compoundCalculator(principal, rate, time);
            System.out.println("Compound Interest is: " + ci);
        }
    }

    private static double compoundCalculator(double principal, double rate, int time) {
        return principal * (Math.pow((1 + rate / 100), time) - 1);
    }
}
