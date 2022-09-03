package teme;

import java.util.Scanner;

public class VersiuneComparSiruri {//citeste de doua ori cate 5 numere si imprima doar cele comune celor doua seturi

    //metoda de citire siruri
    public static void readRow(Scanner scanner, int[] table1, int lgthTabs) {
        System.out.println("Introduceti " + lgthTabs + " numere intregi, cate unul pe un rand:");
        for (int i = 0; i < lgthTabs; i++) {
            table1[i] = Integer.valueOf(scanner.nextLine());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lgthTabs = 5;
        int[] table1 = new int[lgthTabs];
        int[] table2 = new int[lgthTabs];

        readRow(scanner, table1, lgthTabs);
        readRow(scanner, table2, lgthTabs);

        int newLgth1 = getNewLgth(lgthTabs, table1);
        int newLgth2 = getNewLgth(lgthTabs, table2);
        System.out.println(newLgth1 + " " + newLgth2);

        System.out.println("Numerele comune celor doua siruri sunt:");
        for (int i = 0; i < newLgth1; i++) {
            for (int j = 0; j < newLgth2; j++) {
                if (table1[i] == table2[j]) {
                    System.out.println(table1[i]);
                }
            }
        }
    }

    //metoda de transformare siruri in siruri cu elemente distincte:
    //translatez elementele de dupa o dublura peste dublura si scad lungimea
    //pentru fiecare element astfel suprapus

    public static int getNewLgth(int lgthTabs, int[] table1) {
        int contor = lgthTabs;
        boolean noshift = true;  // presupun sirul are doar elemente distincte
        for (int i = 0; i < contor - 1; i++) {
            if (!noshift) {
                noshift=true;} // daca revin la inceputul buclei dupa un shift peste dublura
            for (int j = i + 1; j < contor; j++) {
                if (table1[j] == table1[i]) {
                    System.out.println("i= " + i + " j=" + j);
                    noshift = false; // am gasit o dublura
                    contor = contor - 1; //scurtez sirul si o elimin translatand (mai jos)
                    System.out.println("contorul " + contor);
                    if (j <= contor) {
                        for (int k = j; k < contor; k++) {
                            table1[k] = table1[k + 1];
                        } // translatez elementele de dupa sir peste dublura
                        j = j-1;// ma intorc sa compar si cu elementul peste care am translatat
                        for (int ii = 0; ii < contor; ii++) {
                            System.out.print(table1[ii]);} //print sir rezultat (test)
                        System.out.println(" ");
                    }
                }
            }
        }
        //gata!
        return contor;
    }
}
