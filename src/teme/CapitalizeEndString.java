package teme;

import java.util.Scanner;

public class CapitalizeEndString {

    //Write an application, that will read text (type `String`) and will upper-case letters
    // in last three characters of text.
    //If text is shorter than three characters, your application should upper-case all letters.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti text urmat de Enter: ");
        String sirCitit = scanner.nextLine();

        System.out.println("sirul initial: " + sirCitit);
        int lgth = sirCitit.length();
        char[] sirArray = new char[lgth];

        //convert string to array;
        for (int i = 0; i < lgth; i++) sirArray[i] = sirCitit.charAt(i);

        if (lgth <= 0) {
            System.out.println("Sir nul");
        } else if (lgth <= 2) {
            for (int i = lgth - 1; i >= 0; i--) {
                sirArray[i] = Character.toUpperCase(sirCitit.charAt(i));
            }
        } else {
            for (int i = lgth - 1; i >= lgth - 3; i--) {
                sirArray[i] = Character.toUpperCase(sirCitit.charAt(i));
            }
        }
        // convert back to String
        String sirFinal = String.valueOf(sirArray);

        System.out.println("sirul final: " + sirFinal);

    }
}





