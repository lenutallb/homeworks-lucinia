package teme;

import java.util.Scanner;

public class ComparSiruri2 {

        //citeste de doua ori cate 5 numere si imprima doar cele comune celor doua seturi

        //metoda de citire siruri
        public static void readRow(Scanner scanner, int[] table1, int lgthTabs) {
            System.out.println("Introduceti " + lgthTabs + " numere intregi, cate unul pe un rand:");
            String number_in;
            for (int i = 0; i < lgthTabs; i++) {
                number_in = getStringInt(scanner);
                table1[i] = Integer.valueOf(number_in);
            }
        }

    public static String getStringInt(Scanner scanner) {
        String number_in;
        boolean gata;
        do  {
            number_in = scanner.nextLine();
            if ((number_in .matches("[0-9+]+"))&&(Integer.valueOf(number_in)>0))  {
                gata = true;
            } else {
                gata = false;
                System.out.println("Error: not an integer number greater than zero. Please type in a positive integer number followed by Enter.");
            }
        }
        while (!gata);
        return number_in;
    }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int lgthTabs = 5;
            int[] table1 = new int[lgthTabs];
            int[] table2 = new int[lgthTabs];

            readRow(scanner, table1, lgthTabs);
            readRow(scanner, table2, lgthTabs);

            // compar sirurile


                    }
}



