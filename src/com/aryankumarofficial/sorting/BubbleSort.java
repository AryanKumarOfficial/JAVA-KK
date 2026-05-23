package com.aryankumarofficial.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 5, 3};
        int n = arr.length;

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        Reusable.swap(arr, i, j);
    }

}
