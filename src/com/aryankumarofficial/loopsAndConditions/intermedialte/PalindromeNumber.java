package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number to check if it is palindrome or not: ");
            int num = sc.nextInt();
            System.out.println("The number is" + (isPalindrome(num) ? "  not" : "") + " a palindrome number");
        }
    }

    // with while loop
//    private static boolean isPalindrome(int num) {
//        int temp = num;
//        int reversed = 0;
//        while (temp != 0) {
//            int ld = temp % 10;
//            reversed = reversed * 10 + ld;
//            temp /= 10;
//        }
//        return !(reversed == num);
//    }

    // with for loop
    public static boolean isPalindrome(int num) {
        int reversed = 0;
        for (int i = num; i > 0; i /= 10) {
            int ld = i % 10;
            reversed = reversed * 10 + ld;
        }
        return !(reversed == num);
    }
}
