package com.aryankumarofficial.consitonsAndLoops;

import java.util.Scanner;

public class NumOccurrence {
    public static void main(String[] args) {
        //count the occurrence of a specific digit in a number
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int digit = scan.nextInt();
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == digit) {
                count++;
            }
            num /= 10;
        }
        System.out.println(digit + " occurred " + count + " times ");
    }
}
