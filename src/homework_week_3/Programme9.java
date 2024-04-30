package homework_week_3;

import java.util.Scanner;

public class Programme9 {
    /**
     * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
     * any other alphabet should be invalid entry using Switch case
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Alphabet");
        char cityName = scan.next().toUpperCase().charAt(0);
        cityName(cityName);
        scan.close();
    }

    public static void cityName(char cityName) {

        switch (cityName) {
            case 'A':
                System.out.println("Ahmedabad");
                break;
            case 'B':
                System.out.println("Baroda");
                break;
            case 'C':
                System.out.println("Chennai");
                break;
            case 'D':
                System.out.println("Dehradun");
                break;
            case 'E':
                System.out.println("Eris");
                break;
            case 'F':
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid entry");
        }

    }

}

