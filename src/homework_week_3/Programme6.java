package homework_week_3;

import java.util.Scanner;

public class Programme6 {
    /**
     * Write a java program to input any number and find out if it’s odd or even
     */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        checkEvenOdd(num);
        scan.close();
    }

    public static void checkEvenOdd(int num) {
        if (num % 2 == 0)
            System.out.println(num + " is even number");
        else
            System.out.println(num + " is odd number");
    }

}


