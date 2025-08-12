package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an alphabet: ");
            char ch = sc.next().toLowerCase().charAt(0);
            System.out.println("Alphabet is a " + checkAlphabet(ch));
        }
    }

    private static String checkAlphabet(char ch) {
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        if (vowels.contains(ch)) return "Vowel";
        else return "Consonant";


    }
}
