package com.aryankumarofficial.functions;

import java.util.Scanner;

public class PS_10 {
    public static boolean isPalindrome(int num) {
        int reverse = 0;
        for (int i = num; i > 0; i /= 10) {
            int ld = i % 10;
            reverse = reverse * 10 + ld;
        }
        return reverse == num;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number to check weather it is palindrome or not: ");
            int num = sc.nextInt();
            System.out.println(isPalindrome(num));
        }
    }
}
