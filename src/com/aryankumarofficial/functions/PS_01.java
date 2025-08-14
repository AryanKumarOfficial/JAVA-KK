package com.aryankumarofficial.functions;

import java.util.Scanner;

public class PS_01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first Number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second Number: ");
            int num2 = sc.nextInt();
            System.out.print("Enter the third Number: ");
            int num3 = sc.nextInt();
            printMax(num1, num2, num3);
            printMin(num1, num2, num3);
        }
    }

    private static void printMin(int num1, int num2, int num3) {
        System.out.print("Smallest number is: ");
        if (num1 < num2 && num1 < num3) System.out.println(num1);
        else if (num2 < num1 && num2 < num3) System.out.println(num2);
        else System.out.println(num3);
    }

    private static void printMax(int num1, int num2, int num3) {
        System.out.print("Largest Number is: ");
        if (num1 > num2 && num1 > num3) System.out.println(num1);
        else if (num2 > num1 && num2 > num3) System.out.println(num2);
        else System.out.println(num3);
    }
}
