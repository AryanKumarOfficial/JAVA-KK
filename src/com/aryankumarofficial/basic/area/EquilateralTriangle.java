package com.aryankumarofficial.basic.area;

import java.util.Formatter;
import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the equal side of the triangle:");
        float side = input.nextFloat();
        float area = (float) ((Math.sqrt(3) / 4) * (Math.pow(side, 2)));
        Formatter fmt = new Formatter();
        fmt.format("%.5f", area);
        System.out.println("Area of the equilateral Triangle is: " + fmt);
        fmt.close();
    }
}
