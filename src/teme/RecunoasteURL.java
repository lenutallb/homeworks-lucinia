package teme;

import java.util.Scanner;

public class RecunoasteURL {
    //1) Read text and verify it is url
    public static void main(String[] args) {
        Scanner citeste = new Scanner(System.in);
        String text = citeste.nextLine();
        if (text.startsWith("http://") || text.startsWith("https://")) {
            if (text.matches("[a-zA-Z0-9$&+,:;=?@#|'<>.-^*()%!]")) ;
            {
                System.out.println("URL");
            }
        } else {
            System.out.println("not URL");
        }
    }
}