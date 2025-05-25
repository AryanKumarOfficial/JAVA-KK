package com.aryankumarofficial.functions;

public class Shadowing {
    static int x = 90; // this will be shadowed - doesn't work with methods works with classes

    public static void main(String[] args) {
        System.out.println((x));
        x = 100; // changing the static variable
        int x; // declaration
        x = 40; // initialising // initialising the local variable
        System.out.println((x));
        System.out.println(x);
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
