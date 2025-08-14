package com.aryankumarofficial.functions;

import java.util.Scanner;

public class PS_09 {
    public static void printFactorial(int num) {
        if (num < 0) {
            System.out.println("Undefined");
            return;
        }
        if (num == 0) {
            System.out.println(1);
            return;
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number to find factorial: ");
            int num = sc.nextInt();
            System.out.print("The factorial is: ");
            printFactorial(num);
        }
    }
}
