package com.daniel;

import java.util.Scanner;

public class PoundsToKilogram {
    static final double PB2KG = 0.453592;

    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        double inputpounds = 0.0;
        double resultKilograms = 0.0;

        System.out.println("Pounds To Kilogram converter");
        System.out.print("How many Kilogram?");
        inputpounds = scan.nextDouble();

        resultKilograms = inputpounds * PB2KG;

        System.out.print("converted" + inputpounds +"pounds"+"=");
        System.out.println(resultKilograms +"kilograms");

    }
}
