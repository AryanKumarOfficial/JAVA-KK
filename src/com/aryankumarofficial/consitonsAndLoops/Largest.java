package com.aryankumarofficial.consitonsAndLoops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        // find the largest of three numbers
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println(max);
//        System.out.println("Math: " + Math.max(c, Math.max(a, b)));
    }
}
