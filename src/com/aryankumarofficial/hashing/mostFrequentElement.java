package com.aryankumarofficial.hashing;

import java.util.TreeMap;

public class mostFrequentElement {
    public static void main(String[] args) {
        int[] arr = {4, 4, 5, 5, 6, 1};
        TreeMap<Integer, Integer> hashMap = new TreeMap<>();
        for (int num : arr) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        int maxFreq = Integer.MIN_VALUE;
        int maxNum = Integer.MIN_VALUE;
        for (int num : hashMap.keySet()) {
            if (hashMap.get(num) > maxFreq) maxFreq = hashMap.get(num);
        }
        System.out.println(hashMap);
        System.out.println(maxFreq);
    }
}

