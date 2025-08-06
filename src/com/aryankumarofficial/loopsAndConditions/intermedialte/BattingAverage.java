package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the total run:");
            int run = sc.nextInt();
            System.out.println("Enter the total dismissals:");
            int dismissals = sc.nextInt();
            double battingAverage = run / dismissals;
            System.out.println("Batting Average" + battingAverage);
        }
    }
}
