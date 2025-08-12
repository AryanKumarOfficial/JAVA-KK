package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.util.Scanner;

public class FIV {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the present value: ");
            double pv = sc.nextDouble();
            System.out.print("Enter the rate of growth of money: ");
            double r = sc.nextDouble();
            System.out.print("Enter the number of period money should grow: ");
            double n = sc.nextDouble();
            double futureInvestmentValue = calculateFIV(pv, r, n);
            System.out.println("The future investment value: " + futureInvestmentValue);
        }
    }

    private static double calculateFIV(double pv, double r, double n) {
        return pv * (Math.pow(1 + r / 100, n));
    }
}
