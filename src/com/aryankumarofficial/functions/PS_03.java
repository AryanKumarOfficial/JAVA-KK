package com.aryankumarofficial.functions;

import java.util.Scanner;

public class PS_03 {
    public static boolean isEligible(int age) {
        if (age >= 18) return true;
        return false;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the person's age: ");
            int age = sc.nextInt();
            System.out.println("The person is " + (isEligible(age) ? "eligible" : "not eligible") + " for Vote");
        }

    }
}
