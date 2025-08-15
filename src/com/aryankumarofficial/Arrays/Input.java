package com.aryankumarofficial.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of primitives
//        int[] arr = new int[5];
//        System.out.println(Arrays.toString(arr));
//        arr[0] = 23;
//        arr[1] = 31;
//        arr[2] = 13;
//        arr[3] = 3;
//        arr[4] = 39;
//        System.out.println(arr[3]);

        //   input using for loop
//        for (int i = 0; i < arr.length; i++) arr[i] = in.nextInt();
//          for each loop
//        for (int num : arr) System.out.print(num + " ");

        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
    }
}
