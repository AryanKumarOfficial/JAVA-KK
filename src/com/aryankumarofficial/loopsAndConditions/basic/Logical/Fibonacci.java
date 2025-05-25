package com.aryankumarofficial.loopsAndConditions.basic.Logical;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the taget number: ");
            int target = in.nextInt();
            int count = 1;
            int a = 0;
            int b = 1;
            System.out.print(a + " ");
            System.out.print(b + " ");
            while (target > count) {
                int temp = b;
                b = a + b;
                a = temp;
                System.out.print(b + " ");
                target--;
            }
        }
    }
}
