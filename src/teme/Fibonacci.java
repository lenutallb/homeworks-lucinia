package teme;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int number;
        String number_in;
        int n1 = 1;
        int n2 = 1;
        int result;
        boolean gata;
        Scanner scanner = new Scanner(System.in);

        number_in = getStringInt(scanner);
        number = Integer.valueOf(number_in);

        Fibonacci(number, n1, n2);

    }

    public static String getStringInt(Scanner scanner) {
        String number_in;
        boolean gata;
        do  {
            System.out.println("Type in a positive integer number greater than zero, followed by Enter: ");
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

    public static void Fibonacci(int number, int n1, int n2) {
        int result;
        switch (number) {
            case 1:
                System.out.println("Fibonacci number " + number + " is " + n1);
                break;
            case 2:
                System.out.println("Fibonacci number " + number + " is " + n2);
                break;
            default:
                result = n1;
                for (int i = 1; i < number -1; i++){
                    result = n1 + n2;
                    System.out.println("iteratie" + result);
                    n1 = n2;
                    n2 = result;
                }
                System.out.println("Fibonacci number " + number + " is " + result);
        }
    }
}
