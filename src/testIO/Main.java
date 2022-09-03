package testIO;

public class Main {
    public static void main(String[] args) {
        int valt1 = 234567;
        int val2 = 123456;
        System.out.printf("%6x%n",valt1);
        System.out.printf("val2 modulo valt1 = %5d%n" , valt1 % val2);
        System.out.println(valt1 >= val2);
        System.out.printf("%B%n" , valt1 >= val2);
        System.out.println((valt1>val2) && (valt1 == val2));
        System.out.print("Test new line");
    }
}
