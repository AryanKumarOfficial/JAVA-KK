package com.aryankumarofficial.Arrays.TwoPointers;

import com.aryankumarofficial.sorting.Reusable;

import java.util.ArrayList;

public class SortedPositiveSquare {
    static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        int[] result = squarePositive(arr);
        int[] result2 = square(arr);

        Reusable.display(result2, "Negative Results");

    }

    public static int[] squarePositive(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) Math.pow(nums[i], 2);
        }
        return result;
    }

    public static int[] square(int[] nums) {
        int negativeEnd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) negativeEnd = i;
            nums[i] *= nums[i];
        }
        return merge(nums, negativeEnd);
    }

    public static int[] merge(int[] nums, int negativeEndIdx) {
        int[] result = new int[nums.length];
        int i = negativeEndIdx;
        int j = negativeEndIdx + 1;
        int k = 0;
        while (i >= 0 && j < nums.length) {
            if (nums[i] <= nums[j]) {
                result[k] = nums[i];
                k++;
                i--;
            } else {
                result[k] = nums[j];
                k++;
                j++;
            }
        }

        while (i >= 0) {
            result[k] = nums[i];
            k++;
            i--;
        }
        while (j < nums.length) {
            result[k] = nums[j];
            k++;
            j++;
        }

        return result;
    }
}
