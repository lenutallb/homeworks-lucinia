package teme;

import java.util.Scanner;

public class FibonacciMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 3;
        int FibonacciNth = 2;
        int FibPrevious;
        do {
            FibPrevious = FibonacciNth;
            FibonacciNth = getFibonacciNth(number);
            number = number+1;
            System.out.println(FibonacciNth);
        } while ((FibonacciNth < Integer.MAX_VALUE)&&(FibonacciNth>0));
        // suma a doua numere binare nu poate depasi cu 2 biti - transportul la suma este max 1
        System.out.println("Largest Fibonacci number that can fit in an INT is the " + (number-1) + "th and is  " + FibPrevious);
        System.out.println("Next number is " + FibonacciNth);
    }

    public static int getFibonacciNth(int number) {
        int FibonacciNth = 1;
        switch (number) {
            case 1:
                break;
            case 2:
                break;
            default:
                int n1 = 1;
                int n2 = 1;
                for (int i = 1; i < number - 1; i++) {
                    FibonacciNth = n1 + n2;
                    n1 = n2;
                    n2 = FibonacciNth;
                }
        }
        return FibonacciNth;
    }
}
