package com.aryankumarofficial.Arrays.Questions;

import java.util.ArrayList;
import java.util.List;

public class IsSorted_II {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 1, 4, 5));
        System.out.println(isSorted(list));
    }

    public static boolean isSorted(ArrayList<Integer> nums) {
        boolean result = true;
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) return false;
        }
        return true;
    }
}
