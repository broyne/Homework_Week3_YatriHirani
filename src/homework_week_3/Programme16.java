package homework_week_3;

import java.util.Scanner;

public class Programme16 {
    /**
     * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
     * “ZERO”
     */
    public static void main(String[] args) {
        Programme16 a = new Programme16();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        double number = scan.nextDouble();
        checkNum(number);
        scan.close();

    }
    public static void checkNum(double num){
        if(num>0){
            System.out.println("This is Positive number");
        }else if(num < 0){
            System.out.println("This is negative number");
        }else if(num == 0){
            System.out.println("This is Zero");
        }

    }
}
