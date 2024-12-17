package com.aryankumarofficial.consitonsAndLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the operator(+/-/*/'/'/%):");
            char op = scan.next().trim().charAt(0);
            float ans = (float) 0;
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers:");
                int num1 = scan.nextInt();
                int num2 = scan.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 + num2;
                    } else {
                        System.out.println("Division by zero is not permitted!!");
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
                System.out.println(ans);
            } else if (op == 'x' || op == 'X') {
                System.out.println("Exiting calculator...");
                Thread thread = new Thread(() -> {
                    try {
                        System.out.println("Calculator Exited!!");
                        Thread.sleep(2500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });
                thread.start();
                break;
            } else {
                System.out.println("Invalid Operation!!");
            }
        }
    }
}
