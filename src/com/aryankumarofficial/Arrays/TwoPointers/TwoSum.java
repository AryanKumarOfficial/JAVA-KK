package com.aryankumarofficial.Arrays.TwoPointers;

import com.aryankumarofficial.sorting.Reusable;

import java.util.HashMap;


public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 3};
        int[] result = twoSum(nums, 6);
        Reusable.display(result, "Two sum indices");
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int i;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (i = 0; i < n; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                return new int[]{map.get(comp), i};
            }
            map.put(nums[i], i);
        }

        return new int[0];
    }
}
