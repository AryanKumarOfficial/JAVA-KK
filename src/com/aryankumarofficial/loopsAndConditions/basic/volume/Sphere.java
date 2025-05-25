package com.aryankumarofficial.loopsAndConditions.basic.volume;

import java.util.Scanner;

/**
 * To calculate the volume of the sphere
 */
public class Sphere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere:");
        double radius = scan.nextDouble();
        double volume = 4 * (Math.PI * Math.pow(radius, 3)) / 3;
        System.out.println("Volume of sphere: " + volume);
        scan.close();
    }
}
