package com.aryankumarofficial.switches;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        String fruit = scan.next();
        switch (fruit.toLowerCase()) {
            case "mango" -> System.out.println("King of fruits");
            case "grapes" -> System.out.println("small fruit");
            case "apple" -> System.out.println("a red sweet fruit");
            case "orange" -> System.out.println("round fruit");
            default -> System.out.println("Fruit is healthy!");
        }
         */
        System.out.println("Enter the day number: ");
        int day = scan.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid input");
        }
    }
}
