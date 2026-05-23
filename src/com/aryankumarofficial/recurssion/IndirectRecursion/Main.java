package com.aryankumarofficial.recurssion.IndirectRecursion;

public class Main {
    static int count = 0;

    public static void main(String[] args) {
        int n = 20;
        funA(n);
        System.out.printf("Total Number of Function call: %d", count);

    }

    static void funA(int n) {
        count++;
        if (n > 0) {
            System.out.println(n);
            funB(n - 1);
        }
    }

    static void funB(int n) {
        count++;
        if (n > 1) {
            System.out.println(n);
            funA(n / 2);
        }
    }

}
