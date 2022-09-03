package testStringOperations;

public class Main {

    public static void main(String[] args) {
        String testImmutability = "This is";
        testImmutability += " my text";
        String testValue = "This is test value.";
        String testReplace = "lalala laladi";
        if(testImmutability.equals("This is")) {
            System.out.println("tsk tsk");}
        System.out.println(testImmutability);
        System.out.println(testImmutability.indexOf("w"));
        System.out.println(testImmutability.indexOf("i"));
        System.out.println(testImmutability.indexOf("my"));
        System.out.println(testValue.indexOf("is"));
        System.out.println(testReplace.replaceAll("la","si"));
        System.out.println(testReplace.replaceAll("mi","si"));

        }
    }
