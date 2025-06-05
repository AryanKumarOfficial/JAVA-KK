package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.util.Scanner;

public class AverageN {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("how many numbers to be added: ");
            int n = in.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the number: ");
                int num = in.nextInt();
                sum += num;
            }
            int avg = sum / n;
            System.out.println("Average is: " + avg);
        }
    }
}
