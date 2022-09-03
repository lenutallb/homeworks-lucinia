package teme;

// Write an application that "stutters", that is, reads the user's text (type String), and prints
//the given text, in which each word is printed twice.
//For example, for the input: "This is my test" the application should print "This This is is
//my my test test".

import java.util.Scanner;

public class Stutter2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input;

        do {
            System.out.println("Please write a sentence followed by Enter:");
            input = scanner.nextLine();
        } while ((input == null) || (input.length() == 0));
        int lgth = input.length();
        String [] input_words = input.split(" ");
        for (int j = 0; j < input_words.length; j++) {
            System.out.print(input_words[j] + " " + input_words[j] + " ");
        }
    }



}
