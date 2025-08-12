package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number to sum up its digits: ");
            int num = sc.nextInt();
            int result = sumOfDigit(num);
            System.out.println("Sum of digits: " + result);
        }
    }

    private static int sumOfDigit(int num) {
        int sum = 0;
        while (num != 0) {
            int ld = num % 10;
            sum += ld;
            num /= 10;
        }
        return sum;
    }
}
