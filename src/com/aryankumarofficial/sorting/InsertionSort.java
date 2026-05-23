package com.aryankumarofficial.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        Reusable.display(arr, "Unsorted Array:");
        insertionSort(arr, arr.length);
        Reusable.display(arr, "sorted Array:");
    }

    public static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int x = arr[i];
            while (j > -1 && arr[j] > x) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = x;
        }
    }
}
