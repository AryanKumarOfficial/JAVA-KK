package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.util.Scanner;

public class CPGACalculator {
    public static void main(String[] args) {
        cgpaCalculator();
    }

    public static void cgpaCalculator() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of semesters:");
            int sem = sc.nextInt();
            double totalSgpa = 0;
            for (int i = 1; i <= sem; i++) {
                System.out.printf("Enter the SGPA of semester %d:", i);
                totalSgpa += sc.nextDouble();
            }
            double cgpa = totalSgpa / sem;
            System.out.println("CGPA: " + cgpa);
        }
    }
}
