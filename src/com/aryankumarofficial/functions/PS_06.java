package com.aryankumarofficial.functions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PS_06 {
    public static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double area(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the radius of circle: ");
            double radius = sc.nextDouble();
            System.out.println("The circumference is: " + df.format(circumference(radius)));
            System.out.println("The area of circle is: " + df.format(area(radius)));
        }
    }
}
