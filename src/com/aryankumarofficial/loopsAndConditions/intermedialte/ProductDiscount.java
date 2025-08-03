package com.aryankumarofficial.loopsAndConditions.intermedialte;


// calculate the discount of the product

import java.util.Scanner;

public class ProductDiscount {
    public static void taskMsq(String msq) {
        System.out.println(msq);
    }

    // Interface defines the tasks to be executed by thread
    public static Runnable taskGenerator(int sleep, String msg) {
        Runnable runnable = () -> {
            try {
                // thread is waited/paused
                Thread.sleep(sleep);
                taskMsq(msg);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };
        return runnable;
    }

    public static void main(String[] args) {
        try {
            try (Scanner in = new Scanner(System.in)) {
                while (true) {
                    System.out.print("Enter the price of the product: ");
                    double price = in.nextDouble();
                    System.out.print("Enter the discount for the product: ");
                    double discount = in.nextDouble();


                    double newPrice = (price - (discount * price) / 100);
                    System.out.println("The discounted price of the product is: " + newPrice);
                    System.out.print("Do you want to continue(0/1): ");
                    int ch = in.nextInt();
                    if (ch == 0) {
                        taskMsq("Exiting the Program...");
                        // creating a thread
                        Thread t1 = new Thread(taskGenerator(1000, "Program Terminated"));
                        t1.setPriority(Thread.MAX_PRIORITY); // setting thread priority
                        t1.start(); // starting thread executing
                        t1.join(); // waiting for the thread to complete the executing
                        Thread t2 = new Thread(taskGenerator(1000, "Bye"));
                        t2.setPriority(Thread.MAX_PRIORITY);
                        t2.start();
                        t2.join();
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error Encountered: " + e);
        }
    }
}
