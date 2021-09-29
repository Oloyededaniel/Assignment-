/* Name: Oloyede Olajide Oluwatobiloba Daniel   T.Id- T00684580
                         PROJECT- CALCULATOR */

package com.toshiba;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Please Enter Two Values");

        int valueA, valueB = 0 ;
        System.out.print("Value A: ");
        valueA = scan.nextInt();
        System.out.print("Value B: ");
        valueB = scan.nextInt();

        int sum = valueA + valueB;
        int difference = valueA - valueB;
        int product= valueA * valueB;
        int quotient= valueA / valueB;
        int remainder = valueA % valueB;

        System.out.println("Calculation for "+ valueA + " and " +valueB);
        System.out.println("\t"+ valueA+ "+" + valueB + "=" + sum);
        System.out.println("\t"+ valueA+ "-" + valueB + "=" + difference);
        System.out.println("\t"+ valueA+ "*" + valueB + "="+ product);
        System.out.println("\t"+ valueA+ "/" + valueB + "="+ quotient);
        System.out.println("\t"+ valueA+ "%" + valueB + "=" + remainder);
    }
}
