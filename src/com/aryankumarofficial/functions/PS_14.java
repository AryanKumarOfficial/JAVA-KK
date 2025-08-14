package com.aryankumarofficial.functions;

import java.util.Scanner;

public class PS_14 {
    public static double sumOfFirstNumbers(int n) {
        if (n < 1) return 0;
        return n + sumOfFirstNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to make sum up: ");
        int num = sc.nextInt();
        System.out.println("The sum is: " + sumOfFirstNumbers(num));
        sc.close();
    }
}
