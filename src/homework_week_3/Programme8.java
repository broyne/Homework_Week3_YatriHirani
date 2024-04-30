package homework_week_3;

import java.util.Scanner;

public class Programme8 {
    /**
     * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any other alphabet should be invalid entry
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Alphabet");
        String name = scan.nextLine().toUpperCase();
        cityName(name);
        scan.close();
    }

    public static void cityName(String cityName) {

        if (cityName.equals("A")) {

            System.out.println("Ahmedabad");
        } else if (cityName.equals("B")) {
            System.out.println("Baroda");
        } else if (cityName.equals("C")) {
            System.out.println("Chennai");
        } else if (cityName.equals("D")) {
            System.out.println("Dehradun");
        } else if (cityName.equals("E")) {
            System.out.println("Eris");
        } else if (cityName.equals("F")) {
            System.out.println("Faridabad");
        } else {
            System.out.println("Invalid entry");
        }

    }

}
