package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number for HFC: ");
            int firstNumber = sc.nextInt();
            System.out.print("Enter the second number for HFC: ");
            int secondNumber = sc.nextInt();

            int hcf = calculateHCF(firstNumber, secondNumber);
            System.out.println("HCF of 10 and 20 is: " + hcf);
        }
    }

    protected static int calculateHCF(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int r = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = r;
        }
        return firstNumber;
    }
}
