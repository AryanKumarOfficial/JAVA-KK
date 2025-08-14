package com.aryankumarofficial.functions;

import java.util.Scanner;

public class PS_05 {
    public static double product(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();
            double prod = product(num1, num2);
            System.out.println("The product is: " + prod);
        }
    }
}
