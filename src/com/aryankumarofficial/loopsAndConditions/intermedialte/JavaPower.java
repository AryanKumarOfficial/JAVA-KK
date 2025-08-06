package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.util.Scanner;

public class JavaPower {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the base: ");
            double base = sc.nextDouble();
            System.out.print("Enter the base: ");
            double expo = sc.nextDouble();
            double result = Math.pow(base, expo);
            System.out.println(result);
        }
    }
}
