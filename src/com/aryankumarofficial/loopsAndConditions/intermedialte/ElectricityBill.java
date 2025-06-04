package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the consumption Unit: ");
            int consumption = in.nextInt();
            System.out.print("Enter the tariff charge: ");
            int tariffCharge = in.nextInt();
            int totalBill = consumption * tariffCharge;
            System.out.println("Total Electricity consumption is: " + totalBill);
        }
    }
}
