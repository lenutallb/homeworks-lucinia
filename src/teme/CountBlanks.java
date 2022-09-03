package teme;

import java.util.Scanner;

public class CountBlanks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        String remainder;
        int initialLength;
        int rest;
        int countBlanks = 0;
        int pointer;
        float percentage;
        System.out.println("Please type in a text:");
        // count blanks
        // idea1: search substrings with IndexOf OR use indexOf (string, from index);
        //idea2: use an array
        userInput = scanner.nextLine();
        initialLength = userInput.length();
        if(userInput.length() > 0)
        {   remainder = userInput;
            rest = remainder.length();
           while (remainder.indexOf(" ")!=-1) {
                pointer = remainder.indexOf(" ");
                if (pointer >= 0) {
                    countBlanks = countBlanks + 1;
                    remainder = remainder.substring(pointer+1, rest);
                    rest = remainder.length();
                }
            }
            }
        System.out.println("There are " + countBlanks + " blanks");
        percentage = (countBlanks*100F/initialLength);
        System.out.println(percentage + "%");
        }

    }
