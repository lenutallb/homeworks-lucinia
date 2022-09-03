package teme;

import java.util.Scanner;

public class ListPrimes {

    //Write an application that takes a positive number from the user (type int) and prints all
    //prime numbers greater than 1 and less than the given number

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = getStringInt(scanner);
        listPrimes(count);

    }

    public static int getStringInt(Scanner scanner) {
        String number_in;
        boolean gata;
        do {
            System.out.println("Type in a positive integer number greater than zero, followed by Enter: ");
            number_in = scanner.nextLine();
            if ((number_in.matches("[0-9]+")) && (Integer.valueOf(number_in) > 0) && (Integer.valueOf(number_in) <= Integer.MAX_VALUE)) {
                gata = true;
            } else {
                gata = false;
                System.out.println("Error: not an integer number greater than zero. Please type in a positive integer number followed by Enter.");
            }
        }
        while (!gata);
        return Integer.valueOf(number_in);
    }

    private static void listPrimes(int contor) {
        switch (contor) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("1 \n2");
                break;
            default:
                System.out.println("1 \n2");
                boolean prim;
                for (int numar = 3; numar <= contor; numar++) {
                    prim = true;
                    for (int divizor = 2; divizor <= (numar / 2); divizor++) {
                        if (((numar / divizor) * divizor) == numar) {
                            prim = false;
                            break;
                        }
                    }
                        if (prim) System.out.println(numar);
                    }
                }
    }
}