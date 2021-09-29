import java.util.Scanner;

public class GallonToLitres{
    static final double GAL2LT = 3.78541;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double inputGallons = 0.0;
        double resultsLitres = 0.0;

        System.out.println("Gallons to Litres Converter");
        System.out.print("How many Litres?");
        inputGallons = scan.nextDouble();

        double resultLitres = inputGallons * GAL2LT;
        System.out.print("Converted:" + inputGallons + "gal" + "=");
        System.out.println(resultLitres + "litres");




    }
}
