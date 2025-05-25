package com.aryankumarofficial.loopsAndConditions.basic.perimeter;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length and width of rectangle:");
        float len = scan.nextFloat();
        float width = scan.nextFloat();
        float perimeter = 2 * (len + width);
        System.out.println("Perimeter of rectangle is :" + perimeter);
    }
}
