package teme;

import java.util.Scanner;

public class BMI {

    // Write an application calculating BMI (Body Mass Index) and checking if it’s optimal or not.
    //Your application should read two variables: weight (in kilograms, type float) and height
    //(in centimeters, type int). BMI should be calculated given following formula:
    //The  optimal  BMI  range  is  from  18.5  to  24.9,  smaller  or  larger  values  are  non-optimal
    //values. Your program should write "BMI optimal" or "BMI not optimal", according to the
    //assumptions above.

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float weight;
        weight = Float.valueOf(getStringFloat(read));
        int height;
        height = Integer.valueOf(getStringInt(read));
        float BMI = (weight * 10000F) / (height * height);//inaltimea din formula este in metri (100*100 cm)
        if ((BMI>=18.50)&&(BMI<=24.90)){
        System.out.println("BMI optimal " + BMI);
            }
         else { System.out.println("BMI not optimal " + BMI);
    }
    }

    public static String getStringFloat(Scanner read) {
        String string;
        boolean gata;
        do  {
            System.out.println("Type in your weight in kg (float number, may have decimals):");
            string = read.nextLine();
            if (string.matches("[+-]?\\d*([.]?\\d+)"))  {
                gata = true;
            } else {
                gata = false;
                System.out.println("Error: not a number. Please type in the weight.");
            }
        }
        while (!gata);
        return string;
    }

    public static String getStringInt(Scanner read) {
        String number_in;
        boolean gata;
        do  {
            System.out.println("Type in your height in cm (a positive integer number): ");
            number_in = read.nextLine();
            if ((number_in.matches("[0-9]+"))&&(Integer.valueOf(number_in)>0)&&(Integer.valueOf(number_in)<250))  {
                gata = true;
            } else {
                gata = false;
                System.out.println("Error. Please type in your height in cm.");
            }
        }
        while (!gata);
        return number_in;
    }

}
