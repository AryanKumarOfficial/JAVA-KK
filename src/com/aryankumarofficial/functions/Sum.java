package com.aryankumarofficial.functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum();
        int res = sum3(20, 50);
        System.out.println(res);
    }

    // with arguments
    static int sum3(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    // returns the value
    static int sum2() {
        Scanner scan = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter number 1 here: ");
        num1 = scan.nextInt();
        System.out.print("Enter number 2 here: ");
        num2 = scan.nextInt();
        sum = num1 + num2;
        return sum;


        // unreachable code
        //   System.out.println("Hello");
    }

    static void sum() {
        Scanner scan = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter number 1 here: ");
        num1 = scan.nextInt();
        System.out.print("Enter number 2 here: ");
        num2 = scan.nextInt();
        sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
    /*
    access_modifier? return_type name (arguments) {
        // body
        return statement
      }

     */
}
