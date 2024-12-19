package com.aryankumarofficial.basic.area;

import java.util.Scanner;

// find the area of circle
public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius to find the area of circle:");
        float radius = input.nextFloat();
        float areaOfCircle = (float) (2 * Math.PI * radius * radius);
        System.out.println("Area of circle is: " + areaOfCircle);
    }
}
