package com.aryankumarofficial.Strings;

public class AbeforeB {
    public static void main(String[] args) {
        System.out.println(checkString("bbb"));
    }

    public static boolean checkString(String s) {
        int n = s.length();
        boolean bOccured = false;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'b') bOccured = true;
            if (bOccured && s.charAt(i) == 'a') return false;
        }
        return true;
    }
}
