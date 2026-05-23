package com.aryankumarofficial.sorting;


public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {9, 3, 7, 5, 6, 4, 8, 2};
        Reusable.display(arr, "Unsorted Array");
        int[] sorted = sort(arr, 0, arr.length - 1);
        Reusable.display(sorted, "sorted Array");

    }

    public static int[] sort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            sort(arr, low, mid);
            sort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
        return arr;
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= high) {
            temp[k++] = arr[j++];
        }
        for (i = low, k = 0; i <= high; i++, k++) {
            arr[i] = temp[k];
        }
    }
}
