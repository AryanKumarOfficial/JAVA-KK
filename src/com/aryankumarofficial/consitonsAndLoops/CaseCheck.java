package com.aryankumarofficial.consitonsAndLoops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        // check weather the character is in upper case or lower case
        // trim() removes white space from the string
        // charAt(0) return the character of the particular index
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z')
            System.out.println("small character");
        else
            System.out.println("caps character");
    }
}
