package teme;

// Write an application that gets one positive number (type int) from the user and calculates
//the sum of digits of the given number. Hint: to make some operations on every single digit
//of the number (digit by digit), you can calculate the remainder of dividing the number by
//10 (to get the value of the last digit) and divide the number by 10 (to "move" to the next
//digit).

import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = getStringInt(scanner);
        int sum = sumOfDigits(number);
        System.out.println(number + " sum: " + sum);
    }

    public static int sumOfDigits(int number) {
        int digit;
        int sum = 0;
        int rest = number;
        if (number < 10) { sum = number;}
        else if (number >= 10) {
            while (rest >= 10) {
                digit = rest -((rest/10)*10);
                sum = sum + digit;
                rest = rest/10;
                if (rest<10) sum = sum+rest;
            }
        } // end else
        return sum;
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

}