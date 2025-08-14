package com.aryankumarofficial.functions;

import java.util.Scanner;

public class PS_04 {
    public static void sumTwoNumbers() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            System.out.println("Sum is: " + (num1 + num2));
        }
    }

    public static void main(String[] args) {
        sumTwoNumbers();
    }
}
