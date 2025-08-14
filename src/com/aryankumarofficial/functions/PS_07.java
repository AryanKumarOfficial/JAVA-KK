package com.aryankumarofficial.functions;

import java.util.Scanner;

public class PS_07 {
    public static boolean isPrime(int num) {
        int c = 2;
        while (c * c <= num) {
            if (num % c == 0) return false;
            c++;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            System.out.println("The number is " + (isPrime(num) ? "prime" : "not prime"));
        }
    }
}
