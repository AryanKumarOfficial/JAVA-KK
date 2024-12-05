package com.aryankumarofficial.FirstTutorial;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // type conversion
        // float num = input.nextFloat();
        // System.out.println(num);

        // type casting
        int num = (int) (67.569f);
        System.out.println(num);


        // automatic type promotion in expression
        int a = 257;
        byte b = (byte) a; // 257 % 256 = 1
        System.out.println(b);

        byte p = 40;
        byte q = 50;
        byte r = 100;
        int s = (p*q)/r;
        System.out.println(s);

        int number = 'a';
    }
}

/*
*type conversion automatically converts the data type to another data type variable when*

- two data types are compatible
- and the second data(destination) type must be greater

*type casting is the process of explicitly converting the data types manually also referred as narrow data type
conversion like from float to int*

- destinationVariableDataType identifiersName = (destinationVariableDataType)(oldLiterals)

*type promotion rules*

- all bytes, shorts and characters are promoted to integers
- if any there is at least on float the whole answer of expression will be converted to float
- if any there is at least on double the whole answer of expression will be converted to double
- if any there is at least on long the whole answer of expression will be converted to long
*/