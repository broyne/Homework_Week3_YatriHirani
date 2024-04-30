package homework_week_3;

import java.util.Scanner;

public class Programme1 {
    /**
     * Write a java program that tells us that Input number is odd or even?
     * HINT: use ternary operator (? :)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to check number is even or odd");
        int num = scan.nextInt();
        inputNumber(num);
        scan.close();
    }

    public static void inputNumber(int num) {
        String evenOdd = (num % 2 == 0) ? "even number" : "odd number";
        System.out.println(num + " is " + evenOdd);


    }

}
