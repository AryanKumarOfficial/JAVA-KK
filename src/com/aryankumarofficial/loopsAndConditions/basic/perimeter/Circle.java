package com.aryankumarofficial.loopsAndConditions.basic.perimeter;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        float radius = scan.nextFloat();
        float area = (float) (2 * Math.PI * radius);
        System.out.println("Perimeter of circle is: " + area);
    }
}
