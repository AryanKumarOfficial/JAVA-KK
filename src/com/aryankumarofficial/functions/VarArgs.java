package com.aryankumarofficial.functions;

public class VarArgs {
    public static void main(String[] args) {
        fun(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        multiple(10, 15, "aryan", "kumar", "kush", "john");
    }

    static void multiple(int a, int b, String... x) { // var args always last in the list
    }

    static void fun(int... v) { // variable length argument
        System.out.println(v[0]);
    }
}
