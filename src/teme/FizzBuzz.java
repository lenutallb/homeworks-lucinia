package teme;

import java.util.Scanner;

public class FizzBuzz {

    //Write an application that takes a positive number from the user (type int) and writes all
    //numbers from 1 to the given number, each on the next line, with the following changes:
    //● in place of numbers divisible by 3, instead of a number the program should print "Fizz"
    //● in  place  of  numbers  divisible  by  7,  instead  of  a  number  the  program  should  write
    //"Buzz"
    //● if the number is divisible by both 3 and 7, the program should print "Fizz buzz"

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        number = getStringInt(scanner);
        printFizzBuzz(number);
    }

    public static void printFizzBuzz(int number) {
        for (int i = 1; i <= number; i++) {
            if (((i % 3) == 0) && ((i % 7) != 0)) {
                    System.out.println("Fizz");}
            else if (((i % 3) == 0) && ((i % 7) == 0)){
                    System.out.println("FizzBuzz");
                }
            else if (((i % 7) == 0) && ((i % 3) != 0)) {
                System.out.println("Buzz");
            } else if (((i % 7) != 0) && ((i % 3) != 0)) System.out.println(i);
        }
    }

    public static int getStringInt(Scanner scanner) {
        String number_in;
        boolean gata;
        do  {
            System.out.println("Type in a positive integer number greater than zero, followed by Enter: ");
            number_in = scanner.nextLine();
            if ((number_in.matches("[0-9]+"))&&(Integer.valueOf(number_in)>0)&&(Integer.valueOf(number_in)<=Integer.MAX_VALUE))  {
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
