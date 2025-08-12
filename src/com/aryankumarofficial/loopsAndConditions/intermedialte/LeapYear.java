package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the year to check for leap year: ");
            int year = sc.nextInt();
            System.out.println("This is " + (isLeapYear(year) ? "a leap year" : "not a leap year"));
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }
}
