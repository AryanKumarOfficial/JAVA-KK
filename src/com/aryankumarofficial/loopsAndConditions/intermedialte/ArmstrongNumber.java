package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int n = sc.nextInt();
            int digits = calculateDigits(n);
            boolean result = isArmstrong(n, digits);
            System.out.println(result);
        }
    }

    private static boolean isArmstrong(int n, int digits) {
        double sum = calculateSum(n, digits);

        if (sum == n) return true;
        else return false;
    }

    public static double calculateSum(int n, int digits) {
        double sum = 0;
        for (int i = 0; i < digits; i++) {
            int ld = n % 10;
            sum += Math.pow(ld, digits);
            n /= 10;
        }
        return sum;
    }

    private static int calculateDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
