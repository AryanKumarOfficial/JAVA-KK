package com.aryankumarofficial.functions;

import java.util.Scanner;

public class PS_08 {
    public static String printGrade(int marks) {
        if (marks > 100) return "Invalid Marks";
        else if (marks <= 40) return "Fail";
        else if (marks <= 50) return "Grade: DD";
        else if (marks <= 60) return "Grade: CD";
        else if (marks <= 70) return "Grade: BC";
        else if (marks <= 80) return "Grade: BB";
        else if (marks <= 90) return "Grade: AB";
        else return "Grade: AA";

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your marks: ");
            int marks = sc.nextInt();
            System.out.println(printGrade(marks));
        }
    }
}
