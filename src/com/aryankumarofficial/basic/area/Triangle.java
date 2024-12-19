package com.aryankumarofficial.basic.area;
// area of triangle

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three sides of triangle:");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        float s = (a + b + c) / 2;
        float area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of triangle is :" + area);
    }
}
