package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.util.Scanner;

public class AverageMark {
    public static void main(String[] args) {
        averageMarks();
    }

    public static void averageMarks() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of subjects:");
            int subjects = sc.nextInt();
            double totalMarks = 0;
            for (int i = 1; i <= subjects; i++) {
                System.out.println("Enter the marks of subject " + i);
                totalMarks += sc.nextDouble();
            }
            double averageMark = totalMarks / subjects;
            System.out.println("Average Marks: " + averageMark);
        }
    }
}
