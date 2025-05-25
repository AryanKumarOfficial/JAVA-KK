package com.aryankumarofficial.loopsAndConditions.basic.area;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length and width to find the area of rectangle:");
        float len = input.nextFloat();
        float width = input.nextFloat();
        float area = len * width;
        System.out.println("Area of rectangle is: " + area);
    }
}
