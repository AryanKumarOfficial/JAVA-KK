package com.aryankumarofficial.demo;

public class Main {
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder newStr = new StringBuilder();
        Character.isAlphabetic('A');
        int lastIdx = 0;
        for (int space : spaces) {
            newStr.append(s, lastIdx, space).append(' ');
            lastIdx = space;
        }
        newStr.append(s.substring(lastIdx));
        return newStr.toString();
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
//        int[] spaces = {8, 13, 15};
//        System.out.println(addSpaces(s, spaces));
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }

            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

}
