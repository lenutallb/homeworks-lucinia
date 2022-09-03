package testIfVariabileSwitch;

public class Main {

    static int cc = 1;

    public static void main(String[] args) {
        int localVariable = 10;
        byte myFirstByte = 11;

        System.out.println("number =" + cc);
        System.out.println("localVariable = " + localVariable);
        System.out.println("byte = " + myFirstByte);

        char tab = '\t';
        System.out.println("test" + tab + "test");
        if (cc == localVariable) {
            System.out.println(cc);
        } else {
            System.out.println("nono");
        }
        switch (cc) {
            case 1:
                System.out.println("cazul 1");
                System.out.println("oare ajunge aici");
                break;
            case 2:
                System.out.println("daca este doi");
                break;
            default:
                System.out.println("nothing");
                System.out.println("test linia doi");
                break;
        }

    }
}