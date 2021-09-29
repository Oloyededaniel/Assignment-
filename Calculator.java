/* Oloyede Olajide Oluwatobiloba Daniel   T.Id- T00684580
                      Project- Calculator- float*/

package com.daniel;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Two Values");

        float valueA, valueB = 0 ;
        System.out.print("Value A: ");
        valueA = scan.nextFloat();
        System.out.print("Value B: ");
        valueB = scan.nextFloat();

        float sum = valueA + valueB;
        float difference = valueA - valueB;
        float product= valueA * valueB;
        float quotient= valueA / valueB;
        float remainder = valueA % valueB;

        System.out.println("Calculation for "+ valueA + " and " +valueB);
        System.out.println("\t"+ valueA+ "+" + valueB + "=" + sum);
        System.out.println("\t"+ valueA+ "-" + valueB + "=" + difference);
        System.out.println("\t"+ valueA+ "*" + valueB + "="+ product);
        System.out.println("\t"+ valueA+ "/" + valueB + "="+ quotient);
        System.out.println("\t"+ valueA+ "%" + valueB + "=" + remainder);
    }
}











