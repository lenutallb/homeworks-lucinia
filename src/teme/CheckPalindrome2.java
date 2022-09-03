package teme;

import java.util.Scanner;

public class CheckPalindrome2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gata = true;
        boolean palindrome;
        String sirCitit;
        int lgth;

        // read word
        do {
            System.out.println("Type in a word longer that three letters, followed by Enter: ");
            sirCitit = scanner.nextLine();
            lgth=sirCitit.length();
            if (sirCitit.length() <= 3) {
                System.out.println("The word must be longer than three letters. Retry.");
                gata = false;
            } else if (!sirCitit.matches("[a-zA-Z]+")) {
                System.out.println("The word must contain only letters. Retry.");
                gata = false;
            }
        }
        while (!gata);

        palindrome = true;

        int i = 0;
        do {
            if (sirCitit.charAt(i) == sirCitit.charAt(lgth - 1 - i)) {
                i += 1;
            } else {
                palindrome = false;
            }
        }
        while (palindrome && (i < lgth / 2));
        if (palindrome) {
            System.out.println("This word is a palindrome.");
        } else System.out.println("Not a palindrome.");
    }
}
