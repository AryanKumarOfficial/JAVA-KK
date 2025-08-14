package com.aryankumarofficial.functions;

import java.util.Arrays;
import java.util.Scanner;

public class PS_12 {
    public static void main(String[] args) {
        int[] triplet = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three triplets of pythagoras:");
        for (int i = 0; i < triplet.length; i++) {
            triplet[i] = sc.nextInt();
        }
        System.out.println(isPythagorasTriplet(triplet));
    }

    public static boolean isPythagorasTriplet(int[] triplet) {
        int hyp = Arrays.stream(triplet).max().getAsInt();
        int ab = Arrays.stream(triplet).filter(n -> n != hyp).reduce(0, (part, el) -> part + el * el);
        return (ab == hyp * hyp);
    }
}
