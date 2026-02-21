package com.aryankumarofficial.arrays.easy;


public class Shuffle {

    public static int[] shuffle(int[] num, int n) {
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[2 * i] = num[i];
            result[2 * i + 1] = num[n + i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] t1 = {2, 5, 1, 3, 4, 7};
        int[] result = shuffle(t1, 3);
        System.out.print("[");
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.print("]");

    }
}
