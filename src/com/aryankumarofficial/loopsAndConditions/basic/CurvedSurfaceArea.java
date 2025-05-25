package com.aryankumarofficial.loopsAndConditions.basic;


import java.util.Scanner;

/**
 * TO CALCULATE THE CURVE SURFACE AREA OF THE CYLINDER - 2*PI*R*H
 */
public class CurvedSurfaceArea {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the radius of the cylinder: ");
            double radius = in.nextDouble();
            System.out.print("Enter the height of the cylinder: ");
            double height = in.nextDouble();

            double result = 2 * Math.PI * radius * height;
            System.out.println("Curved Surface Area of the cylinder is :" + (float) result + " sq. unit");
        }
    }
}
