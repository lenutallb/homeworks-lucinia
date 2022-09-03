package teme;

import java.util.Scanner;

public class Factorialul {
    // Compute n!

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gataCitire = false;
        int numar;
        do {
            System.out.println("Introduceti un numar intreg mai mare decat zero si mai mic decat 20:");
            numar = Integer.valueOf(scanner.nextLine());
            if ((numar <= 0) || (numar >= 20)) {
                System.out.println("Numarul trebuie sa fie mai mare decat 0 si mai mic decat 20");
            } else {
                gataCitire = true;
            }
        }
            while (!gataCitire);

        calculFactorial(numar);
    }

    public static void calculFactorial(int numar) {
        long factorial = 1;
        for (int ff = 1; ff <= numar; ff++) {
            factorial = factorial * ff;
        }
        System.out.printf("%d%n", factorial);
    }

}

