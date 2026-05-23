package com.aryankumarofficial.sorting;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 5, 3};
        Reusable.display(arr, "Unsorted Array:");
        bubbleSort(arr, arr.length);
        Reusable.display(arr, "sorted Array:");
    }

    public static void bubbleSort(int[] arr, int n) {
        if (n > 1) {
            for (int i = 0; i <= n - 2; i++) {
                if (arr[i] < arr[i + 1]) {
                    Reusable.swap(arr, i, i + 1);
                }
            }
            bubbleSort(arr, n - 1);
        }
    }
}
