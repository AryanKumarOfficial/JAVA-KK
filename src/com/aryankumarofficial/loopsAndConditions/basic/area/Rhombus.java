package com.aryankumarofficial.loopsAndConditions.basic.area;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the both diagonals of rhombus:");
        float d1 = input.nextFloat();
        float d2 = input.nextFloat();
        float area = (float) (0.5 * d1 * d2);
        System.out.println("Area of rhombus is: " + area);
    }
}
