package com.aryankumarofficial.Arrays.TwoPointers;

import java.util.ArrayList;
import java.util.Map;

public class TwoSumTwoSortedArray {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        ArrayList<Integer> result = twoSum(arr, 9);
        int[] parsed = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            parsed[i] = result.get(i);
        }
        for (int num : parsed) {
            System.out.print(num + " ");
        }
    }

    public static ArrayList<Integer> twoSum(int[] nums, int target) {
        ArrayList<Integer> response = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                response.add(i);
                response.add(j);
                return response;
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return response;
    }
}
