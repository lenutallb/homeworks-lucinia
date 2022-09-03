package teme;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortWords {

    // Write a program that reads the text entered by the user
    // and then divides it into individual words and writes them to the console
    // in alphabetical order.

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
            i += 1;
        }
        for (int j = 0; j < i; j++) {
            System.out.println(input_words[j]);
        }

        // sort the words

        Sort(input_words, i);
        System.out.println("Sorted words:");
        for (int jk = 0; jk < i; jk++) {
            System.out.println(input_words[jk]);
        }

    }

    public static void Sort(String[] input_words, int i) {
        String min;
        String swap;
        int index_min;
        for (int jj = 0; jj < i; jj++){
            min = input_words[jj];
            index_min = jj;
            for(int ii = jj+1; ii < i; ii++) {
                if (input_words[ii].compareToIgnoreCase(min) < 0) {
                    min = input_words[ii];
                    index_min = ii;
                }
            }
                // swap first element with elem minim
                swap = input_words[jj];
                input_words[jj] = input_words[index_min];
                input_words[index_min] = swap;
            }
    }
}
