package com.aryankumarofficial.loopsAndConditions.basic.volume;

import java.util.Scanner;

/**
 * To calculate the volume of the pyramid
 */
public class Pyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base length of the Pyramid:");
        double l = scan.nextDouble();
        System.out.println("Enter the base width of the Pyramid:");
        double w = scan.nextDouble();
        System.out.println("Enter the height of the Pyramid:");
        double h = scan.nextDouble();

        double volume = ((l * w) * h) / 3;
        System.out.println("The volume of the Pyramid is: " + volume);
    }
}
