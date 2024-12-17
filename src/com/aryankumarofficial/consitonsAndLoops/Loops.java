package com.aryankumarofficial.consitonsAndLoops;

public class Loops {
    public static void main(String[] args) {

        /*
           syntax for the for loop:
           for(initialization; condition; expression(increment/decrement)){
            //body
            }
         */
        // Q. Print number 1 to five
//        for (int num = 1; num <= 5; num++) {
//            System.out.println(num);
//        }

        // print 1 to n
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//
//        for (int num = 1; num <= n; num++) {
//            System.out.println(num);
//        }

        // while loop
        /*
            syntax for while loop:
                while(condition){
                    //body
                  }
         */

        int num = 1;
        while (num <= 5) {
//            System.out.println(num);
            num++;
        }

        // do while loop
        /*
        syntax :
        do{
        //body
        }while(condition);
         */

        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);
    }
}
