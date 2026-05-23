package com.aryankumarofficial.sorting;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        Reusable.display(arr, "Unsorted Array:");
        sort(arr, 0, arr.length);
        Reusable.display(arr, "Sorted Array using recursive insertion:");
    }

    public static void sort(int[] arr, int i, int n) {
        if (i == n) return;
        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            Reusable.swap(arr, j - 1, j);
            j--;
        }
        sort(arr, i + 1, n);
    }
}
