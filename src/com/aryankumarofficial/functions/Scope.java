package com.aryankumarofficial.functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10; // function scope
        int b = 10; // function scope
        String name = "Aryan";

        {
            // int a = 78; // redeclaration in not allowed in new scope under a function
            a = 99; // but can change the value
            int c = 10;
            name = "Kush";
            System.out.println(name);
        }
//        System.out.println(c); // can't use outside the bloack
        System.out.println(name);
        System.out.println(a);

        // for loop scopes
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            // int a = 11; // cannot define again
        }
        // System.out.println(i); // can't access here
    }


    static void random(int marks) {
        int num = 67; // function scope
        System.out.println(num);
        System.out.println(marks);
    }
}
