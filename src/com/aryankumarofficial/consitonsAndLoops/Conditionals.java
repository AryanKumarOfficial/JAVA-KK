package com.aryankumarofficial.consitonsAndLoops;

public class Conditionals {
    public static void main(String[] args) {
        /*
         * syntax of if statement:
         * if(boolean expression T or F){
         *  // body
         * }
         * else{
         *  // do this
         * }
         * */

        int salary = 24_500;
        /*
        if (salary > 10_000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }
         */

        // multiple if else statement
        if (salary > 10_000) {
            salary += 2000;
        } else if (salary > 20_000) {
            salary += 3000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}
