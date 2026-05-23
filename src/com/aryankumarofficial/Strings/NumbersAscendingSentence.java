package com.aryankumarofficial.Strings;

import org.jetbrains.annotations.*;

import java.util.*;

public class NumbersAscendingSentence {
    public static void main(String[] args) {
        System.out.println(areNumbersAscending("hello world 5 x 5"));
        System.out.println(areNumbersAscendingUsingCharacterClass("hello world 5 x 5"));
    }

    public static boolean areNumbersAscending(@NotNull String s) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (String str : s.split(" ")) {
            try {
                nums.add(Integer.parseInt(str));

            } catch (NumberFormatException _) {
            }
        }
        System.out.println(nums);
        return isSorted(nums);
    }

    public static boolean isSorted(@NotNull ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) >= nums.get(i + 1)) return false;
        }
        return true;
    }

    public static boolean areNumbersAscendingUsingCharacterClass(String s) {
        ArrayList<Integer> nums = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        for (Character ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                temp.append(ch);
            } else {
                if (!temp.isEmpty()) {
                    nums.add(Integer.parseInt(temp.toString()));
                    temp = new StringBuilder();
                }
            }
        }
        if (!temp.isEmpty()) {
            nums.add(Integer.parseInt(temp.toString()));
        }
        return isSorted(nums);
    }


}
