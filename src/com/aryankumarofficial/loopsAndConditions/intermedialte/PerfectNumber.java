package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number to check if perfect or not: ");
            int num = sc.nextInt();
            System.out.println("The number is " + (isPerfectNumber(num) ? "a perfect Number" : "not a perfect Number"));
        }
    }

    private static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }

        return sum == num;
    }
}
