package teme;


import java.util.Scanner;

public class ShrinkTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Table length: ");
        int lgth = scanner.nextInt();
        int[] table = new int[lgth];

        // read table
        System.out.println("Introduceti " + lgth + " numere intregi:");
        for (int i = 0; i < lgth; i++) {
            table[i] = scanner.nextInt();
        }

        for (int i = 0; i < lgth; i++) {
            System.out.print(table[i] + " \n");
        }

        int contor = lgth;
        boolean noshift = true;
            for (int i = 0; i < contor - 1; i++) {
                if (!noshift) {
                    i=i-1; noshift=true;}
                for (int j = i + 1; j < contor; j++) {
                    if (table[j] == table[i]) {
                        System.out.println("i= " + i + " j=" + j);
                        noshift = false;
                        contor = contor - 1;
                        System.out.println("contorul " + contor);
                        if (j <= contor) {
                            for (int k = j; k < contor; k++) {
                                table[k] = table[k + 1];
                            }
                            for (int ii = 0; ii < contor; ii++) {
                                System.out.print(table[ii]);}
                            System.out.println(" ");
                        }
                    }
                }
            }

       if ((contor == 2) && (table[contor-1]==table[contor-2])) {contor = contor -1;}

            System.out.println("elemente distincte: " + contor);
            for (int i = 0; i < contor; i++) {
                System.out.print(table[i] + " \n");
            }


        }
    }
