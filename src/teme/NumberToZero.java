package teme;

import java.util.Scanner;

public class NumberToZero {

    // Write an application, that will read a number (of type `int`)
    // and will write in one line all numbers starting from given number to 0 (included).

    public static void main(String[] args) {
        int number;
        Scanner reader = new Scanner(System.in);
        boolean gata;
        String num;

        do  {
            System.out.println("Type in an integer number: ");
            num = reader.nextLine();
            if (num.matches("[0-9-+]+"))  {
            gata = true;
             } else {
            gata = false;
            System.out.println("Error: not an integer number.");
            }
        }
        while (!gata);
        number = Integer.valueOf(num);
        int i = number;
        do {
            System.out.print(" " + i);
            if (i < 0) {
                i += 1;
                if (i == 0) {
                    System.out.print(" " + i);
                }
            } else if (i > 0) {
                i -= 1;
                if (i == 0) {
                    System.out.print(" " + i);
                }
            }
        }
        while (i != 0);


    }
}
