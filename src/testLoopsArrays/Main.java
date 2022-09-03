package testLoopsArrays;

public class Main {
    public static void main(String[] args) {
         String[] array = {"1", "11", "abc", "4567"};
         for(String element: array) {
             System.out.println(element);
                 }
        for (int i = 0; i < 10; i++) {
            System.out.println("test break " + i);
            if(i == 5) {
                continue;
            }
            System.out.println("test again " + i);
            if (i == 7) {
                break;
             }
         }
    }
}
