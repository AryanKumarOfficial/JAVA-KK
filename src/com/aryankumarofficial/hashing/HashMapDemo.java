package com.aryankumarofficial.hashing;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 8, 3, 6, 7, 99, 6, 8, 77, 6, 9, 6};
        HashMap<Integer, Integer> hashTable = new HashMap<>();
        for (int num : arr) {
            hashTable.put(num, hashTable.getOrDefault(num, 0) + 1);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hashTable.entrySet()) {
            List<Integer> temp = new ArrayList<>();
            temp.add(entry.getKey());
            temp.add(entry.getValue());
            result.add(temp);
        }
        System.out.println(result);

        Set<Integer> s = hashTable.keySet();
        System.out.println(s);

        int maxFreq = Integer.MIN_VALUE;
        int maxNum = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : hashTable.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxNum = entry.getKey();
            }
        }
//        System.out.println(maxFreq + " " + maxNum);
    }
}
