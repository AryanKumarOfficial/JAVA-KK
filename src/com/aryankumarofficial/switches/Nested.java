package com.aryankumarofficial.switches;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Employee ID:");
        int EID = scan.nextInt();
        System.out.println("Enter the department:");
        String department = scan.next();

        switch (EID) {
            case 1 -> System.out.println("Aryan Kushwaha");
            case 2 -> System.out.println("Rakesh Singh");
            case 3 -> {
                System.out.println("John Doe");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Backend" -> System.out.println("Backend Department");
                    case "Frontend" -> System.out.println("Frontend Department");
                    case "Test" -> System.out.println("Testing Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("General Department");
                }
            }
            default -> System.out.println("Intern");
        }

    }
}
