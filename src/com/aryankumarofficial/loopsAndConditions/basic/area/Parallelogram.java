package com.aryankumarofficial.loopsAndConditions.basic.area;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base and height of parallelogram:");
        float base = in.nextFloat();
        float height = in.nextFloat();

        float area = base * height;
        System.out.println("Area of parallelogram is: " + area);
    }
}
