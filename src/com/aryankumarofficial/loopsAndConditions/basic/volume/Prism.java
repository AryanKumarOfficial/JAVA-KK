package com.aryankumarofficial.loopsAndConditions.basic.volume;

import java.util.Scanner;

/**
 * To calculate the volume of the prims.
 * <p>
 * Assuming that rectangular prism is given
 * </p>
 * <p>
 * Area = B*H
 * <br/>
 * B = l*w;
 * </p>
 *
 * @author aryan
 */
public class Prism {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base length of the prism: ");
        double l = scan.nextDouble();
        System.out.println("Enter the base width of the prism: ");
        double w = scan.nextDouble();
        double b = l * w;
        System.out.println("Enter the height of the prism: ");
        double h = scan.nextDouble();
        double volume = b * h;
        System.out.println("The volume of the prism is: " + volume);
        scan.close();
    }
}
