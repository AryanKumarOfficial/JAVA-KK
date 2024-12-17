package com.aryankumarofficial.consitonsAndLoops;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to reverse it:");
        long num = scan.nextLong();
        long result = 0;
        while (num > 0) {
            long rem = num % 10;
            result = result * 10 + rem;
            num /= 10;
        }
        System.out.println("reversed num is :" + result);
    }
}
