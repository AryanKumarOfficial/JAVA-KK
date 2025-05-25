package com.aryankumarofficial.FirstTutorial;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
//            int n = in.nextInt();
            // System.out.println(isPrime(n));
//            System.out.println(isArmstrong(n));
            for (int i = 100; i < 1000; i++) {
                if (isArmstrong(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    // armstrong number

    static boolean isArmstrong(int x) {
        long sum = 0;
        long temp = x;
        while (temp > 0) {
            long rem = temp % 10;
            long cube = rem * rem * rem;
            sum += cube;
            temp /= 10;
        }
        return sum == x;
    }

    static boolean isPrime(int x) {
        if (x <= 1) return false;
        int c = 2;
        while (c * c <= x) {
            if (x % c == 0) return false;
            c++;
        }
        return c * c > x;
    }
}
