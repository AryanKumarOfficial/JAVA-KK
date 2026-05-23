package com.aryankumarofficial.Arrays;

import com.aryankumarofficial.sorting.Reusable;

public class RotateByK {
    static void main() {
        int[] nums = {1, 2};
        int n = nums.length - 1;
        int k = 3;
        if (n > 0) {
            rotate(nums, 0, n);
            rotate(nums, 0, k - 1);
            rotate(nums, k, n);
        }
        Reusable.display(nums, STR."Rotated by \{3}");
    }

//    private static void rotate(int[] nums, int k) {
//        int n = nums.length;
//        for (int i = 0; i < k; i++) {
//            int temp = nums[n - 1];
//            for (int j = n - 1; j > 0; j--) {
//                nums[j] = nums[j - 1];
//            }
//            nums[0] = temp;
//        }
//    }

    private static void rotate(int[] nums, int startIdx, int endIdx) {
        int l = startIdx;
        int r = endIdx;
        while (l < r) {
            Reusable.swap(nums, l, r);
            l++;
            r--;
        }
    }
}
