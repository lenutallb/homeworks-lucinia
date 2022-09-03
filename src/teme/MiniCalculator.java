package teme;

import java.util.Scanner;

public class MiniCalculator {

    // Write an application that implements a simple calculator. The application should:
    //a. read first number (type float)
    //b. read one of following symbols: + - / *
    //c. read second number (type float)
    //d. return a result of given mathematical operation
    //If the user provides a symbol other than supported, the application should print "Invalid
    //symbol". If the entered action cannot be implemented (i.e. it is inconsistent with the
    //principles of mathematics), the application should print "Cannot calculate".

    public static void main(String[] args) {

        float operand1;
        float operand2;
        String op1;
        String op2;
        String operation;
        boolean gata;
        Scanner reader = new Scanner(System.in);

        op1 = getFloatNumber(reader);
        operand1 = Float.valueOf(op1);

        operation = getOperationCode(reader);

        op2=getFloatNumber(reader);
        operand2 = Float.valueOf(op2);

        calculate(operand1, operand2, operation);
    }

    private static void calculate(float operand1, float operand2, String operation) {
        float result;

        switch (operation) {
            case "+":
                result = operand1 + operand2;
                System.out.println(operand1 + operation + operand2 + " = " + result);
                break;
            case "-":
                result = operand1 - operand2;
                System.out.println(operand1 + operation + operand2 + " = " + result);
                break;
            case "*":
                result = operand1 * operand2;
                System.out.println(operand1 + operation + operand2 + " = " + result);
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {result = operand1 / operand2;
                    System.out.println(operand1 + operation + operand2 + " = " + result);}
                break;
            default:
                result = 0;
                System.out.println("Should never get here if coding ok");
                break;
        }
    }

    public static String getOperationCode(Scanner reader) {
        String operation;
        boolean gata;
        do  {
            System.out.println("Type in the operation (+,-,*,/):");
            operation = reader.nextLine();
            System.out.println(operation);
            // op = operation.charAt(0);
            if ((operation.equals("+"))||(operation.equals("-"))||(operation.equals("*"))||(operation.equals("/")))  {
                gata = true;
            } else {
                gata = false;
                System.out.println("Invalid operation symbol. Retry.");
            }
        }
        while (!gata);
        return operation;
    }

    public static String getFloatNumber(Scanner reader) {
        String op1;
        boolean gata;
        do  {
            System.out.println("Type in an operand (float number, format nnn or nnn.nn):");
            op1 = reader.nextLine();
            if (op1.matches("[+-]?\\d*([.]?\\d+)"))  {
                gata = true;
            } else {
                gata = false;
                System.out.println("Error: not a number. Retry.");
            }
        }
        while (!gata);
        return op1;
    }
}
