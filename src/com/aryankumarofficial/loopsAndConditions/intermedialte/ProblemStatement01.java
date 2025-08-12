package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.util.Scanner;

// Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
public class ProblemStatement01 {
    public static void main(String[] args) {
        int day = 31; // since number of days in August is 31
        int count = 0;
        for (int i = 1; i <= day; i++) {
            if (i % 2 == 0) count++;
        }
        System.out.println("total number of days Kunal can go with his friends in the month of August is: " + count);
    }
}
