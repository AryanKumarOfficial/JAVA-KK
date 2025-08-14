package com.aryankumarofficial.functions;

import java.util.Scanner;

public class PS_02 {
    public static String evenOrOdd(int num) {
        if (num % 2 == 0) return "Even";
        else return "Odd";
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number to check if even or odd: ");
            int num = sc.nextInt();
            System.out.println("The number is " + evenOrOdd(num));
        }
    }
}
