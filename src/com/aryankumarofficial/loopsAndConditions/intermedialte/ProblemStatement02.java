package com.aryankumarofficial.loopsAndConditions.intermedialte;

// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero

import java.util.ArrayList;
import java.util.Scanner;

public class ProblemStatement02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Integer> list = new ArrayList<>();
            while (true) {
                System.out.print("Enter the number: ");
                int num = sc.nextInt();
                if (num == 0) break;
                list.add(num);
            }
            int sum = list.stream().mapToInt(Integer::intValue).sum();
            System.out.println("Sum is: " + sum);
        }
    }
}
