package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.util.Scanner;

public class DepreciationCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the initial cost: ");
            double initial = sc.nextDouble();
            System.out.print("Enter the salvage value: ");
            double salvage = sc.nextDouble();
            System.out.print("Enter total life use: ");
            double usefullLife = sc.nextDouble();
            double result = depreciationCalculator(initial, salvage, usefullLife);
            System.out.println(result);
        }
    }

    public static double depreciationCalculator(double initial, double salvage, double useFullLife) {
        if (useFullLife <= 0) return 0;
        return (initial - salvage) / useFullLife;
    }
}
