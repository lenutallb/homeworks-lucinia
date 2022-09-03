package teme;

// Write an application that will read texts (variables of the String type) until the user gives
//the text "Enough!" and then writes the longest of the given texts (not including the text
//"Enough!"). If the user does not provide any text, write "No text provided".

import java.util.Scanner;

public class LongestText {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String justRead;
        String longestSoFar = "";
        int maxLgth = 0;
        do{
            System.out.println("Type text followed by Enter:");
            justRead = scanner.nextLine();
            // memoreaza sirul cel mai lung pana in acel moment (daca nu e Enough!);
            if ((justRead.length() > maxLgth)&&(!justRead.equals("Enough!"))) {

                    maxLgth = justRead.length();
                    longestSoFar = justRead;
            }
        }
        while(!justRead.equals("Enough!"));
        if (maxLgth == 0) {System.out.println("No text provided.");}
        else {System.out.println("The longest string is:");
        System.out.println(longestSoFar);}
    }
}
