package teme;

//Write a program for solving a quadratic equation. The program should take three integers
//(coefficients of the quadratic equation a, b, c) and calculate the roots of the equation.
// If delta ∆ comes out negative, print "Delta negative" and exit the program

import java.util.Scanner;

public class EcuatieGradulDoi {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a, b, c;
        System.out.println("Please input the three coefficients of the equation as requested below:");
        a = Integer.valueOf(getStringInt(read));
        b = Integer.valueOf(getStringInt(read));
        c = Integer.valueOf(getStringInt(read));
        System.out.println("The equation to solve is: " + a + "*X**2 + " + b + "*x + " + c + "= 0");

        float delta;
        float radical;
        float x1;
        float x2;
        float x11, x12;
        boolean irrational;
        if ((a == 0) && (b == 0)) {
            System.out.println("Nu este ecuatie; toti coeficientii lui x sunt 0");
        } else {
            delta = ((b * b) - (4F * a * c));
            if (a == 0) {
                x1 = (-c) / (1F * b);
                System.out.println("Radacinile sunt in acest caz egale:" + x1);
            } else {
                if (delta >= 0) {
                    radical = (float) Math.sqrt(delta);
                    irrational = false;
                } else {
                    radical = (float) Math.sqrt(-delta);
                    irrational = true;
                }
                if (!irrational) {
                    x1 = (-b + radical) / (2F * a);
                    x2 = (-b - radical) / (2F * a);
                    System.out.println("x1 = " + x1 + "; x2 = " + x2);
                } else {
                    x11 = (-b) / (2F * a);
                    x12 = radical / (2F * a);
                    System.out.println("x1 = " + x11 + "+ i*" + x12 + "; x2 = " + x11 + "- i*" + x12);
                }
            }
        }
    }

    public static String getStringInt(Scanner read) {
        String number_in;
        boolean gata;
        do {
            System.out.println("Type in an integer number between -300 and +300: ");
            number_in = read.nextLine();
            if ((number_in.matches("[+-]?[0-9]+")) && (Integer.valueOf(number_in) > -300) && (Integer.valueOf(number_in) < 300)) {
                gata = true;
            } else {
                gata = false;
                System.out.println("Error. Please type in an integer number between -300 and +300.");
            }
        }
        while (!gata);
        return number_in;

    }
}
