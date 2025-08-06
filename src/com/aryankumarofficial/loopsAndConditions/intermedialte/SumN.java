package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter n:");
            int n = sc.nextInt();
            int result = sumN(n);
            System.out.println(result);
        }
    }

    public static int sumN(int n) {
        return n * (n + 1) / 2;
    }
}
