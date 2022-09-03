package teme;

import java.util.Scanner;

public class HarmonicSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = getStringInt(scanner);
        double harmonic = getHarmonic(count);
        System.out.println("The harmonic sum until n is: " + harmonic);
    }

    public static double getHarmonic(int count) {
        double harmonic = 0D;
        for (int i = 1; i<= count; i++){
            harmonic = harmonic + (1D/i);
        }
        return harmonic;
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
                System.out.println("Error: not an integer number. Please type in a positive integer number followed by Enter.");
            }
        }
        while (!gata);
        return Integer.valueOf(number_in);
    }
}
