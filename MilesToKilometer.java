package com.daniel;

import java.util.Scanner;

public class MilesToKilometer{
    static final double ML2KM = 1.60935;

    public static void main(String[] args) {
       Scanner scan= new Scanner (System.in);
       double inputMiles = 0.0;
       double resultKilometers = 0.0;

        System.out.println("Miles to Kilometers converter");
        System.out.print("How many Kilometers?");
        inputMiles = scan.nextDouble();

        resultKilometers = inputMiles * ML2KM;

        System.out.print("converted" + inputMiles +"Miles"+"=");
        System.out.println(resultKilometers +"kilometers");

    }
}
