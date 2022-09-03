package testCitireScriereWhile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // creates the tool for input;
        Scanner intrare = new Scanner(System.in);
        // reads until gata;
        boolean gata = true;
        while (!gata) {
            // prompt for text;
            String text = intrare.nextLine();
            System.out.println("ati scris:" + text);
            gata = (text.equals("gata"));
        }
    }
}
