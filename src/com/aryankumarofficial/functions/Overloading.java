package com.aryankumarofficial.functions;

import java.util.Arrays;

/**
 * Functions with same name but with different argument types or number of arguments
 */

public class Overloading {
    public static void main(String[] args) {
        fun(100);
        fun("Aryan");

        System.out.println(sum(3, 4));
        System.out.println(sum(3,13,73));
    }

    static void fun(int marks) {
        System.out.println("Marks Obtained: " + marks);
    }

    static void fun(String name) {
        System.out.println("Winner is: " + name);
    }

    static long sum(int a, int b) {
        return a + b;
    }

    static long sum(long... nums) {
        long sum = 0;

        for (long i : nums) {
            sum += i;
        }
        //  return sum;
        return Arrays.stream(nums).sum();
    }
}
