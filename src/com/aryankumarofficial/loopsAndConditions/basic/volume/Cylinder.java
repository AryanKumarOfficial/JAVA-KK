package com.aryankumarofficial.loopsAndConditions.basic.volume;

import java.util.Scanner;

/**
 * To calculate the volume of the cylinder
 * <p>
 * Volume = PI*r^2*h
 * </p>
 */

public class Cylinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder:");
        double radius = scan.nextDouble();
        System.out.println("Enter the height of the cylinder:");
        double height = scan.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder is: " + volume);
    }
}
