package teme;

import java.util.Scanner;

public class  FindJava {

    // Write a program that reads the text entered by the user, and then checks if the word "Java" appears in the text
    //- checks if the text equals the word "Java", if yes it prints the message "Equals Java"
    //- if the text starts with the word Java it prints the message "Starts with Java"
    //- if the text ends with the word Java it prints the message "Ends with Java"
    //- if neither of the previous, but it contains the word java, it prints the message "Found Java"

    public static void main(String[] args) {

        String input;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please write a sentence followed by Enter; the system will look for the string 'java':");
            input = scanner.nextLine();
        } while ((input == null) || (input.length() == 0));

        int lgth = input.length();
        int index = input.indexOf("Java");
        //int indexfinal = input.lastIndexOf("Java");
        if (index == -1) {
            System.out.println("The text does not contain the word Java");
        } else if (index == 0) {
            if (lgth > 4)
            System.out.println("Starts with Java");
            else
                System.out.println("Is Java");
        } else if (index == (lgth - 4)) {
            System.out.println("Ends with Java");
        } else if (index > 0 && index < (lgth - 4)) {
            System.out.println("Found Java");
        }
    }
}
