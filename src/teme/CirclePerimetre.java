package teme;

import java.util.Scanner;

public class CirclePerimetre {

    // Write  an  application  that  will  read  diameter  of  a  circle  (variable  of  type  float)  and
    //calculate perimeter of given circle.
    //Firstly, assume π = 3.14. Later, use value of π from built-in Math class.

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String diametru;
        float diam;
        boolean gata;
        float perimetre;

        diametru = getStringFloat(read);
        diam = Float.valueOf(diametru);
        perimetre = diam*((float)Math.PI);
        System.out.println("Perimetre is: " + perimetre);
    }

    public static String getStringFloat(Scanner read) {
        String diametru;
        boolean gata;
        do  {
            System.out.println("Type in the circle diametre (format nnn or nnn.nn):");
            diametru = read.nextLine();
            if (diametru.matches("[+-]?\\d*([.]?\\d+)"))  {
                gata = true;
            } else {
                gata = false;
                System.out.println("Error: not a number. Please type in the diametre.");
            }
        }
        while (!gata);
        return diametru;
    }
}
