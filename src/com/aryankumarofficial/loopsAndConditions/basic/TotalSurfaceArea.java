package com.aryankumarofficial.loopsAndConditions.basic;

import java.util.Scanner;

public class TotalSurfaceArea {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the side of the cube: ");
            double a = in.nextDouble();
            double result = 6 * Math.pow(a, 2);
            System.out.println("Total Surface Area of cube is: " + result);
        }
    }
}
