package com.aryankumarofficial.loopsAndConditions.basic.perimeter;

import java.util.Scanner;

/**
 * To find the perimeter of rhombus
 */
public class Rhombus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side of the rhombus:");
        int side = scan.nextInt();
        int perimeter = 4 * side;
        System.out.println("Perimeter of the rhombus: " + perimeter);
        scan.close();
    }
}
