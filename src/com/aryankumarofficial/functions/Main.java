package com.aryankumarofficial.functions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Q: take input of two numbers and print the sum
        Scanner scan = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter number 1 here: ");
        num1 = scan.nextInt();
        System.out.print("Enter number 2 here: ");
        num2 = scan.nextInt();
        sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
}