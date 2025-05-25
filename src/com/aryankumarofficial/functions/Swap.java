package com.aryankumarofficial.functions;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a + " " + b);
        // swapping numbers
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a, b);
        System.out.println(a + " " + b);

        String name = "Aryan Kushwaha";
        changeName(name);
        System.out.println(name);
    }

    private static void changeName(String name) {
        name = "Aryan";
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
