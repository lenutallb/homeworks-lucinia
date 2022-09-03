package teme;

import java.util.Scanner;

public class CountBlanks2 {

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
            countBlanks = 0;
            for (int i=0; i< userInput.length(); i++){
                if(' '==(userInput.charAt(i))) {countBlanks=countBlanks+1;}
            }
            System.out.println("There are " + countBlanks + " blanks");
            percentage = (countBlanks*100F/initialLength);
            System.out.println(percentage + "%");
        }

    }


