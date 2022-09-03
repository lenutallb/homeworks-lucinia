package teme;

import java.util.Scanner;

public class CharsBetweenTwoLetters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startList;
        int endList;
        char c1 = getLetter(scanner);
        System.out.println(c1);
        char c2 = getLetter(scanner);
        System.out.println(c2);
        // compar literele si listez de la cea mai mica la cea mai mare
        int c1Code = c1;
        int c2Code = c2;
        System.out.println(c1Code + " " + c2Code);
        startList=codeForStart(c1Code, c2Code);
        endList=codeForEnd(c1Code, c2Code);
        listLetters(startList, endList, scanner);
        System.out.println("\n There are " + (endList - startList +1) + " characters in the list.");
    }


    public static char getLetter(Scanner scanner) {
        System.out.println("TYpe in a letter:");
        return scanner.next().toLowerCase().charAt(0);

    }

    public static void listLetters(int startList, int endList, Scanner scanner) {
        System.out.println("The list of characters is:");
        for (int i = startList; i <= endList; i++) {
            System.out.print((char) i);
        }
    }

    public static int codeForStart (int c1Code, int c2Code) {
        if (c1Code >= c2Code) {
            return c2Code;
        } else {
            return c1Code;
        }
    }

    public static int codeForEnd (int c1Code, int c2Code) {
        if (c1Code >= c2Code) {
            return c1Code;
        } else {
            return c2Code;
        }
    }
}
