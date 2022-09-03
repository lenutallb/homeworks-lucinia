package teme;

import java.util.Scanner;

public class Waves

{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gata;
        do {
            int waves = getStringInt(scanner);
            // draw
            for (int i1=1; i1<=waves; i1++){
            System.out.print("*      *");
            }
            System.out.println();
            for(int i1=1; i1<=waves; i1++){
            System.out.print(" *    * ");}
            System.out.println();
            for (int i1=1; i1<=waves; i1++){
                System.out.print("  *  *  ");
            }
            System.out.println();
            for (int i1=1; i1<=waves; i1++){
                System.out.print("   **   ");
            }
            System.out.println();
            //draw
            System.out.println("Another drawing? Y or N?");
            gata = scanner.nextLine();
        } while(gata.equals("Y"));
    }

    public static int getStringInt(Scanner scanner) {
        String number_in;
        boolean gata;
        do {
            System.out.println("Type in a positive integer number greater than zero and less than 20, followed by Enter: ");
            number_in = scanner.nextLine();
            if ((number_in.matches("[0-9]+")) && (Integer.valueOf(number_in) > 0) && (Integer.valueOf(number_in) <= 20)) {
                gata = true;
            } else {
                gata = false;
                System.out.println("Error: not an integer number 0<n<=20. Please type in a positive integer number followed by Enter.");
            }
        }
        while (!gata);
        return Integer.valueOf(number_in);

}

}
