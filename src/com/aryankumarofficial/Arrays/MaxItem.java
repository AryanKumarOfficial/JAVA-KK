package com.aryankumarofficial.Arrays;

import java.util.Arrays;

import static com.aryankumarofficial.Arrays.Swap.swap;

public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {411, 144, 34, 11, 200, 95, 71};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(getMax(arr));
//        System.out.println(getMax(arr, 1, 4));
    }

    public static int getMax(int[] arr) {
        if (arr.length == 0) return -1;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static int getMax(int[] arr, int initialIdx, int finalIdx) {
        if (initialIdx > finalIdx || arr.length == 0) return -1;
        int max = 0;
        for (int i = initialIdx; i <= finalIdx; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    static void reverse(int[] arr) {
        // using two pointer methods
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - 1 - i);
        }
    }
}
