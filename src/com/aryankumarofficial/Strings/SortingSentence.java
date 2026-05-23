package com.aryankumarofficial.Strings;

import java.util.Arrays;

public class SortingSentence {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

    public static String sortSentence(String s) {
        String[] splited = s.split(" ");
        String[] concatStr = new String[splited.length];
        for (String sh : splited) {
            concatStr[Integer.parseInt(String.valueOf(sh.charAt(sh.length() - 1))) - 1] = sh.substring(0, sh.length() - 1);
        }
        return String.join(" ", concatStr);
    }
}
