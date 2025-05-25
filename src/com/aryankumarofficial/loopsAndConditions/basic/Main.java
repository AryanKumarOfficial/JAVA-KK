package com.aryankumarofficial.loopsAndConditions.basic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        try {
            int c = a / b;
            System.out.println("Answer: " + c);
        } catch (ArithmeticException e) {
            throw new Exception("Division by zero not permitted");
        }
    }
}
