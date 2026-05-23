package com.aryankumarofficial.countingOccurance;

public class ManualHashing {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 8, 3, 6, 7, 9, 6, 8, 7, 6, 9, 6};
        int target = 6;
        int[] hashTable = new int[10];
        for (int j : arr) {
            hashTable[j]++;
        }
        for (int n : hashTable) {
            System.out.println(n);
        }
        System.out.println(hashTable[target]);
    }
}
