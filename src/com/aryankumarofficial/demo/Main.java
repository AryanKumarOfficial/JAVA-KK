package com.aryankumarofficial.demo;

public class Main {
  public static String addSpaces(String s, int[] spaces) {
    StringBuilder newStr = new StringBuilder();
    int lastIdx = 0;
    for (int space : spaces) {
        newStr.append(s, lastIdx, space).append(' ');
        lastIdx = space;
    }
    newStr.append(s.substring(lastIdx));
    return newStr.toString();
}

    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {8, 13, 15};
        System.out.println(addSpaces(s, spaces));
    }

}
