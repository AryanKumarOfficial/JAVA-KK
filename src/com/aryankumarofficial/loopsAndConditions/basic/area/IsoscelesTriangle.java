package com.aryankumarofficial.loopsAndConditions.basic.area;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length and height isosceles triangle:");
        float len = in.nextFloat();
        float height = in.nextFloat();

        float area = (float) 0.5 * len * height;
        System.out.println("Area of Isosceles Triangle is: " + area);
    }
}
