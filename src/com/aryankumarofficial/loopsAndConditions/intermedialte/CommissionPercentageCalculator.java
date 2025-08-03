package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CommissionPercentageCalculator {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            DecimalFormat df = new DecimalFormat("#.####");
            System.out.print("Enter the total amount: ");
            double amount = in.nextDouble();
            System.out.print("Enter the commission: ");
            double comm = in.nextDouble();

            Double commPercent = (comm / amount) * 100;
            System.out.println("The commission Percentage of " + amount + " at commission of: " + df.format(commPercent) + "%");

        }
    }
}
