package teme;

import java.util.Scanner;

public class CheckPalindrome {

    // Write an application that will read text (type `String`) and check if given text is a palindrome.
    // Your application should print `true` or `false`

    public static void main(String[] args) {

        // fields
        Scanner scanner = new Scanner(System.in);
        boolean gata;
        boolean palindrome;
        String sirCitit;

        int lgth;

        // read word
        do {
            gata = true;
            System.out.println("Type in a word longer that three letters, followed by Enter: ");
            sirCitit = scanner.nextLine();
            if (sirCitit.length() <= 3) {
                System.out.println("The word must be longer than three letters. Retry.");
                gata = false;
            } else if (!sirCitit.matches("[a-zA-Z]+")) {
                System.out.println("The word must contain only letters. Retry.");
                gata = false;
            }
        }
        while (!gata);

        // assume word is palindrome and verify via method isPalindrome
        palindrome=true;
        palindrome = isPalindrome(palindrome, sirCitit);

        // print result of checking whether word is a palindrome
        if (palindrome) {
            System.out.println("This word is a palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }
    }
    //method isPalindrome returns boolean result;
    public static boolean isPalindrome(boolean palindrome, String sirCitit) {
        int lgth;
        lgth = sirCitit.length();
        char[] sirArray = new char[lgth];
        //convert string to array;
        for (int i = 0; i < lgth; i++) {
            sirArray[i] = sirCitit.charAt(i);
        }
        int i = 0;
        do {
            if (sirArray[i] == sirArray[lgth - 1 - i]) {
                i += 1;
            } else {
                palindrome = false;
            }
        }
        while (palindrome && (i < lgth / 2));
        return palindrome;
    }
}
