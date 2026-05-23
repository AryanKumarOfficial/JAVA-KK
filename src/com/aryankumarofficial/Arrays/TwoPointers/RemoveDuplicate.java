package com.aryankumarofficial.Arrays.TwoPointers;

import com.aryankumarofficial.sorting.Reusable;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 2, 3, 4};
        System.out.println(removeDuplicate(arr));
    }

    public static int removeDuplicate(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 1;
        for (; j < n; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        Reusable.display(nums, "Unique Elements at start");

        return i + 1;
    }
}
