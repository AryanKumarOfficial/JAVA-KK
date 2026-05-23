package com.aryankumarofficial.Arrays.Questions;

public class SecondLargest {
    public static void main(String[] args) {
        int[] nums = {100, -10, -100, -200};
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i <= n - 1; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
            }
            if (secondMax < nums[i] && nums[i] < max) {
                secondMax = nums[i];
            }
        }
        System.out.println(secondMax > Integer.MIN_VALUE ? secondMax : -1);
    }
}
