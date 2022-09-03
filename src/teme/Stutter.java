package teme;

// Write an application that "stutters", that is, reads the user's text (type String), and prints
//the given text, in which each word is printed twice.
//For example, for the input: "This is my test" the application should print "This This is is
//my my test test".

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stutter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input;
        int max = 100; // max 100 words in our sentence
        String[] input_words = new String [max];

        do {
            System.out.println("Please write a sentence followed by Enter:");
            input = scanner.nextLine();
        } while ((input == null) || (input.length() == 0));

        int lgth = input.length();
        Pattern p = Pattern.compile("[a-zA-Z]+"); // pattern: a word
        Matcher m1 = p.matcher(input); //find the words in the string input
        int i = 0; // number of words
        while (m1.find()) {
            input_words[i] = m1.group();
            i += 1; // counts the words
        }
        for (int j = 0; j < i; j++) {
            System.out.print(input_words[j] + " " + input_words[j] + " ");
        }
    }



}
