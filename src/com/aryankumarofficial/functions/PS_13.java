package com.aryankumarofficial.functions;

import java.util.Scanner;

import static com.aryankumarofficial.functions.PS_07.isPrime;

public class PS_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower bound number:");
        int lowerBound = sc.nextInt();
        System.out.println("Enter the upper bound number:");
        int upperBound = sc.nextInt();
        printPrimeNumbers(lowerBound, upperBound);
        sc.close();
    }

    private static void printPrimeNumbers(int lowerBound, int upperBound) {
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
        System.out.println();
    }
}
