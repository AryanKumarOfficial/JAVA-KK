package com.aryankumarofficial.sorting;

public class QuickSort {
    static int[] nums = {10, 16, 8, 12, 15, 6, 3, 9, 5};

    public static void main(String[] args) {
        Reusable.display(nums, "Unsorted Array:");
        sort(0, nums.length - 1);
        Reusable.display(nums, "sorted Array:");
    }

    public static void sort(int low, int high) {
        if (low < high) {
            int j = partition(low, high);
            sort(low, j);
            sort(j + 1, high);
        }
    }

    public static int partition(int low, int high) {
        int pivot = nums[(low)];
        int i = low, j = high;
        while (i < j) {
            while (nums[i] <= pivot) {
                i++;
            }
            while (nums[j] > pivot) {
                j--;
            }
            if (i < j) {
                Reusable.swap(nums, i, j);
            }
        }
        Reusable.swap(nums, low, j);
        return j;
    }
}
