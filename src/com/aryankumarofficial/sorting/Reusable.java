package com.aryankumarofficial.sorting;

public class Reusable {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void display(int[] arr, String... message) {
        if (message.length > 0) {
            System.out.println(String.join(" ", message));
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
