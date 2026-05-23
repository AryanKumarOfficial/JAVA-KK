package com.aryankumarofficial.countingOccurance;

public class BasicTraversal {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 8, 3, 6, 7, 99, 6, 8, 77, 6, 9, 6};
        int target = 6;
        int count = 0;
        for (int num : arr) {
            if (num == target) count++;
        }
        System.out.println(count);
    }
}
