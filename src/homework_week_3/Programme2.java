package homework_week_3;

import java.util.Scanner;

public class Programme2 {
    /**
     * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Year");
        int num = scan.nextInt();
        inputYear(num);
        scan.close();
    }

    public static void inputYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is Leap Year");
        } else {
            System.out.println(year + " is not Leap year");
        }
    }


}
