package com.aryankumarofficial.Arrays;

import java.util.Arrays;

public class Functions {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 55};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

        String[] names = {"aryan", "kush", "mafia", "donar"};
        System.out.println(Arrays.toString(names));
        change(names);
        System.out.println(Arrays.toString(names));
    }

    public static void change(String[] arr) {
        arr[0] = "changed";
    }

    public static void change(int[] arr) {
        arr[0] = 99;
    }
}
