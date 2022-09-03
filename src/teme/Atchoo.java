package teme;

// Write an application that reads a text from the user (type String) and checks whether the
//user sneezed, i.e. whether the text equals ‘achooo!’ with one or more letter "o" at the end
//of the expression (so both 'acho!' and 'achooooooo!’ are correct). Hint: use a regular
//expression with the appropriate quantifier.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Atchoo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I'm listening:");
        String userSays = scanner.nextLine();
        Pattern p = Pattern.compile("atch[o]+"); // pattern: a word
        Matcher m1 = p.matcher(userSays);
        if (m1.find()) {System.out.println("bless you! covid?");};
    }

}
