package com.aryankumarofficial.Arrays;

import java.util.Arrays;
// swapping elements in array

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 12, 3};
        System.out.println(Arrays.toString(arr));
        swap(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        if (idx1 >= arr.length || idx2 >= arr.length)
            throw new RuntimeException("Array index out of bound: " + idx1 + " " + idx2);

        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
