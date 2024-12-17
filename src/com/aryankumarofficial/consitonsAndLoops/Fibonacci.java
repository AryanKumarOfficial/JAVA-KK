package com.aryankumarofficial.consitonsAndLoops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // find the nth fibonacci number
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to find fibonacci number:");
        int n = scan.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;
        while (count <= n) {
            int temp = i;
            i = i + p;
            p = temp;
            count++;
        }
        System.out.print(i + " ");
    }
}
