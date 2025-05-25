package com.aryankumarofficial.loopsAndConditions.basic.perimeter;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of equilateral triangle:");
        float side = input.nextFloat();
        float perimeter = 3 * side;
        System.out.println("Perimeter of rectangle is: " + perimeter);
    }
}
