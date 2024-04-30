package homework_week_3;

import java.util.Scanner;

public class Programme12 {
    /**
     * Write a program that tells us input value is number or an alphabet or symbol.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value");
        char character = scan.next().charAt(0);
        value(character);
        scan.close();

    }

    public static void value(char ch) {
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println("This is a Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("This is a Number");
        } else {
            System.out.println("This is a Symbol");
        }
    }
}

