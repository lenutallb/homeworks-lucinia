package teme;

import java.util.Scanner;

public class FibonacciCount {

    //Write  an  application  that  will  take  a  positive  number  from  the  user  (type  int)  and
    //calculate the Fibonacci number at the indicated index. For example, if the number equals
    //5, your program should print the fifth Fibonacci number. In Fibonacci sequence, each
    //number  is  the  sum  of  the  two  preceding  ones.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number_in = getStringInt(scanner);
        int number = Integer.valueOf(number_in);
        int FibonacciNth = getFibonacciNth(number);
        System.out.println("The " + number + "th Fibonacci number is: " + FibonacciNth);
    }

    public static int getFibonacciNth(int number) {
        int FibonacciNth = 1;
        switch (number) {
            case 1:
                break;
            case 2:
                break;
            default:
                int n1 = 1;
                int n2 = 1;
                for (int i = 1; i < number - 1; i++) {
                    FibonacciNth = n1 + n2;
                    n1 = n2;
                    n2 = FibonacciNth;
                }
        }
        ;
        return FibonacciNth;
    }


    public static String getStringInt(Scanner scanner) {
        String number_in;
        boolean gata;
        do  {
            System.out.println("Type in a positive integer number >0 and <=47, followed by Enter: ");
            number_in = scanner.nextLine();
            if ((number_in .matches("[0-9+]+"))&&(Integer.valueOf(number_in)>0))  {
                gata = true;
            } else {
                gata = false;
                System.out.println("Error: not an integer number 0<n<=47. Please type in a positive integer number followed by Enter.");
            }
        }
        while (!gata);
        return number_in;
    }
}
