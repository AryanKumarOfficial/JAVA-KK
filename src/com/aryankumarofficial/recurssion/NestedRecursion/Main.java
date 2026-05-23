package com.aryankumarofficial.recurssion.NestedRecursion;

public class Main {
    public static void main(String[] args) {
        int n = 95;
        int r = fun(n);
        System.out.println(r);
    }

    static int fun(int n) {
        if (n > 100) return n - 10;
        else return fun(fun(n + 11));
    }
}
