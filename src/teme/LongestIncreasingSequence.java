package teme;

import java.util.Scanner;

public class LongestIncreasingSequence {

    // Write an application that takes 10 numbers from the user (type int) and write the length
    //of the longest such subsequence of these numbers, which is increasing.
    //For example, for the numbers: "1, 3, 8, 4, 2, 5, 6, 11, 13, 7" the program should write "5"
    //as the length of the longest increasing subsequence (underlined in the example).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startSequence = 0;
        int countSequence = 0;
        int maxSequence = 0;
        int[] numbers = new int[10];
        String number_in;
        //citeste cele 10 numere;
        for (int i = 0; i < 10; i++) {
            number_in = getStringInt(scanner);
            numbers[i] = Integer.valueOf(number_in);
        }
        // gaseste cea mai lunga secventa crescatoare

    }


    public static String getStringInt(Scanner scanner) {
        String number_in;
        boolean gata;
        do  {
            System.out.println("Type in a positive integer number followed by Enter: ");
            number_in = scanner.nextLine();
            if ((number_in .matches("[0-9+]+"))&&(Integer.valueOf(number_in)>0))  {
                gata = true;
            } else {
                gata = false;
                System.out.println("Error: not a positive integer number. Please type in a positive integer number followed by Enter.");
            }
        }
        while (!gata);
        return number_in;
    }
}
