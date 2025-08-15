package com.aryankumarofficial.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Arrays!");
        int[] rollNumbers = new int[5];
        // directly
        int[] rollNumbers2 = {10, 20, 3, 60, 40, 50};

        int[] rows; // declaration - stack
        rows = new int[5]; // initialization - heap
        System.out.println(rows[1]);

        boolean[] arr = new boolean[4];
        System.out.println(arr[2]);
    }
}
