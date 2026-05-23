package com.aryankumarofficial.recurssion.TailHead;

public class Main {
    public static void main(String[] args) {
        int x = 3;
        fun(x);
    }

    static void fun(int n) {
        if (n > 0) {
            fun(n - 1);
            System.out.printf("%d ", n);
        }
    }
}
