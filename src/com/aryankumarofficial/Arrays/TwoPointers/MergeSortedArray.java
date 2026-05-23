package com.aryankumarofficial.Arrays.TwoPointers;

import com.aryankumarofficial.sorting.Reusable;

public class MergeSortedArray {
    static void main() {
        int[] n1 = {1};
        int[] n2 = {4, 5, 6};

        merge(n1, n2, 3, 3);
        Reusable.display(n1, "Merged Array");
    }

    private static void merge(int[] n1, int[] n2, int n, int m) {
        int i = n - 1;
        int j = m - 1;
        int k = n1.length - 1;
        while (i >= 0 && j >= 0) {
            if (n1[i] > n2[j]) {
                n1[k] = n1[i];
                i--;
            } else {
                n1[k] = n2[j];
                j--;
            }
            k--;
        }
        while (i >= 0) {
            n1[k] = n1[i];
            k--;
            i--;
        }
        while (j >= 0) {
            n1[k] = n2[j];
            k--;
            j--;
        }
    }
}
