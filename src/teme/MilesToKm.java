package teme;

import java.util.Scanner;

public class MilesToKm {

    public static void main(String[] args) {
        // Write a method which converts kilometers to miles, returning the result.
        // Write another method which converts miles to kilometers, returning the result.

        Scanner reader = new Scanner (System.in);
        float km;
        float miles;
        String num;
        boolean gata;

        do  {
            System.out.println("Type in the number of miles (format nnn or nnn.nn):");
            num = reader.nextLine();
            // am gasit pe un forum fomatul regex (semnul poate lipsi; punctul zecimal poate lipsi)
            if (num.matches("[+-]?\\d*([.]?\\d+)"))  {
                gata = true;
            } else {
                gata = false;
                System.out.println("Error: not a number.");
            }
        }
        while (!gata);
        km = Float.valueOf(num);
        miles = getMiles(km);
        System.out.printf("%.2f km = %.2f miles %n", km, miles);
        km = getKm((float) miles);
        System.out.printf("%.2f miles = %.2f km %n", miles, km);
    }
    // the system mentioned that these methods already exist;
    private static float getKm(float miles) {
        float km;
        km = (float)(miles * 1.609344);
        return km;
    }

    public static float getMiles(float km) {
        return (float) (km * 0.62137119);
    }
}
