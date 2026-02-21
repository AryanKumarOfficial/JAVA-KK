package com.aryankumarofficial.arrays.easy;

import java.util.*;

public class GreatestCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int largest = Arrays.stream(candies).max().getAsInt();

        for (int i = 0; i < candies.length; i++) {
            if((candies[i] + extraCandies) >= largest) {
                result.add(i, true);
            } else {
                result.add(i, false);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        System.out.println(kidsWithCandies(candies, 3));
    }
}
