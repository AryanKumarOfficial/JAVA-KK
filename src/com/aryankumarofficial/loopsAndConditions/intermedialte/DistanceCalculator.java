package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.util.Scanner;

// calculate the distance between two points

class Point2D {
    double p1;
    double p2;

    public Point2D(double p1, double p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point2D(Point2D p1, Point2D p2) {
        this.p1 = p2.p1 - p1.p1;
        this.p2 = p2.p2 - p1.p2;
    }

    @Override
    public String toString() {
        return "\nx: " + this.p1 + "\ny: " + this.p2 + "\n";
    }
}

public class DistanceCalculator {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double x, y;
            System.out.println("Enter the co-ordinates of first point: ");
            System.out.print("x: ");
            x = in.nextDouble();
            System.out.print("y: ");
            y = in.nextDouble();
            Point2D p1 = new Point2D(x, y);

            System.out.println("Enter the co-ordinates of second point: ");
            System.out.print("x: ");
            x = in.nextDouble();
            System.out.print("y: ");
            y = in.nextDouble();
            Point2D p2 = new Point2D(x, y);

            Point2D result = new Point2D(p1, p2);
            System.out.println("The distance between " + p1 + " and " + p2 + " is: " + result);
        }
    }
}
