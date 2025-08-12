package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the String to reverse it: ");
            String str = sc.nextLine();
            System.out.println("String before reverse: " + str + "\nString after reverse: " + reverse(str));

        }
    }

    public static String reverse(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}
