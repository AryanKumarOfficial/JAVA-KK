package com.aryankumarofficial.recurssion;

public class PrintName {
    public static void main(String[] args) {
        print("Aryan", 10);
    }

    public static void print(String name, int times) {
        if (times <= 0)
            return;
        System.out.println(name);
        print(name, times - 1);
    }

}
