package homework_week_3;

import java.util.Scanner;

public class Programme10 {
    /**
     * Write a java program to input any two number and ask user to enter their symbol (+, -, /, *) find addition, Subtraction,
     * multiplication and division according to their symbol
     * (using if else)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First number");
        double num1 = scan.nextDouble();

        System.out.println("Enter Second number");
        double num2 = scan.nextDouble();

        System.out.println("Enter Symbol");
        char symbol = scan.next().charAt(0);

        arithmetic(num1, num2, symbol);
        scan.close();
    }

    public static void arithmetic(double num1, double num2, char operation) {

        double result = 0;
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '/') {
            result = num1 / num2;
        } else if (operation == '*') {
           result = num1 * num2;
        } else {
            return;

        }
        System.out.println("Answer is " + result);

    }
}
