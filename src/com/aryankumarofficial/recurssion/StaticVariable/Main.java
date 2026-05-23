package com.aryankumarofficial.recurssion.StaticVariable;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        System.out.printf("%d ", fun(a));
    }


    static int fun(int n) {
        if (n > 0) {
            return fun(n - 1) + 5;
        }
        return 0;
    }

}
