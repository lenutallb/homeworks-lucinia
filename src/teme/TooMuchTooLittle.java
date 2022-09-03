package teme;

// Write an application that will play "too much, too little" game with you. At the beginning
//the  application  should  randomly  choose  a  number  from  0  to  100  (hint:  use  the
//Random.nextInt() method) and wait for the user to enter a number. If the user gives a
//number greater than the number chosen by the computer, your application should print
//"too  much"  and  wait  for  the  next  number.  If  the  user  gives  a  smaller  number,  the
//application should print "not enough" and wait for the next number in the same way. If
//the  user  provides  the  exact  value,  the  application  should  print  the  word
//"Congratulations!" and finish.

import java.util.Random;
import java.util.Scanner;

public class TooMuchTooLittle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random ran = new Random();
        int machine;
        int player;
        machine = ran.nextInt(100);
        player = getStringInt(scanner);
        playGame(scanner, machine, player);
    }

    private static void playGame(Scanner scanner, int machine, int player) {
        boolean gata = false;
        do {
            if (player < machine) {
                System.out.println("Too little.");
                player = getStringInt(scanner);
            } else if (player == machine) {
                System.out.println("Congratulations!");
                gata = true;
            } else if (player > machine) {
                System.out.println("Too much");
                player = getStringInt(scanner);
            }
        }
        while (!gata);
    }

    public static int getStringInt(Scanner scanner) {
        String number_in;
        boolean gata;
        do {
            System.out.println("Type in a positive integer number 0<n<100, followed by Enter: ");
            number_in = scanner.nextLine();
            if ((number_in.matches("[0-9]+")) && (Integer.valueOf(number_in) >= 0) && (Integer.valueOf(number_in)<=100)) {
                gata = true;
            } else {
                gata = false;
                System.out.println("Error: not an integer number greater than zero. Please type in a positive integer number followed by Enter.");
            }
        }
        while (!gata);
        return Integer.valueOf(number_in);
    }
}

