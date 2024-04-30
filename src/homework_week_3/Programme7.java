package homework_week_3;

import java.util.Scanner;

public class Programme7 {
    /**
     * Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales Commission
     * Sales amount >= 50,000 35%
     * Sales amount >= 30,000 20%
     * >= 20,000 10%
     * >= 10,000 5%
     * < 10,000 2%
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Name: ");
        String name = scan.nextLine();

        System.out.println("Enter a sales id: ");
        int sid = scan.nextInt();

        System.out.println("Enter sales amount: ");
        double sAmount = scan.nextDouble();

        System.out.println("Enter a Salary basic: ");
        double salaryBasic = scan.nextDouble();


        finalSalesCommission(name, sid, sAmount, salaryBasic);
        scan.close();
    }

    public static void finalSalesCommission(String name, int salesID, double salesAmount, double salaryBasic) {
        double commisionRate;
        double totalsalry = salaryBasic + salesAmount;
        if (salesAmount >= 50000) {
            commisionRate = (salesAmount * 0.35);
        } else if (salesAmount >= 30000) {
            commisionRate = (salesAmount * 0.20);
        } else if (salesAmount >= 20000) {
            commisionRate = (salesAmount * 0.10);
        } else if (salesAmount >= 10000) {
            commisionRate = (salesAmount * 0.05);
        } else {
            commisionRate = (salesAmount * 0.02);


        }
        System.out.println("Commisionrate is " + commisionRate);
        System.out.println("Total salary is " + (totalsalry + commisionRate));
    }
}

