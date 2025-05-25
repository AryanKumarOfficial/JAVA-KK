package com.aryankumarofficial.loopsAndConditions.basic.perimeter;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the equal sides of parallelogram:");
        float a = in.nextFloat();
        float b = in.nextFloat();

        float perimeter = 2 * (a + b);
        System.out.println("Perimeter of parallelogram is: " + perimeter);
    }
}
