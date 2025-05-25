package com.aryankumarofficial.loopsAndConditions.basic.volume;

import java.util.Scanner;

/**
 * To calculate the volume of cone
 */
public class Cone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the cone:");
        double radius = scan.nextDouble();
        System.out.println("Enter the height of the cone:");
        double height = scan.nextDouble();

        double volume = (Math.PI * (Math.pow(radius, 2)) * height) / 3;
        System.out.println("Volume of the cone is : " + volume);

    }
}
