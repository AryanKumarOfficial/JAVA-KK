package com.aryankumarofficial.sorting;

public class MergingArrays {
    public static void main(String[] args) {
        int[] num1 = {2, 8, 15, 18};
        int[] num2 = {5, 9, 12, 17};

        int[] res = merge(num1, num2);

        for (int el : res) {
            System.out.print(el + " ");
        }
    }

    @org.jetbrains.annotations.Contract(pure = true)
    public static int @org.jetbrains.annotations.NotNull [] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] >= arr2[j]) {
                result[k++] = arr2[j++];
            } else if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            }
        }

        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        return result;
    }
}
