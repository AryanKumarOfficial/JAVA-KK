package com.aryankumarofficial.loopsAndConditions.intermedialte;

import java.util.Scanner;

import static com.aryankumarofficial.loopsAndConditions.intermedialte.HCF.calculateHCF;

public class LCM {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number to calculate LCM: ");
            int firstNumber = sc.nextInt();
            System.out.print("Enter the second number to calculate LCM: ");
            int secondNumber = sc.nextInt();
            int lcm = calculateLCM(firstNumber, secondNumber);
            System.out.println("LCM is : " + lcm);
        }
    }

    private static int calculateLCM(int firstNum, int secondNum) {
        int hcf = calculateHCF(firstNum, secondNum);
        return (firstNum * secondNum) / hcf;
    }
}
