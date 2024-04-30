package homework_week_3;

import java.util.Scanner;

public class Programme5 {
    /**
     * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
     * HRA = basic salary 10%
     * DA = Basic salary 8%
     * TA = Basic salary 9%
     * PF= Basic salary 20%
     * Gross salary = basic salary + HRA + TA + DA –PF
     * Print in following format
     * _______________________________
     * |         Salary Slip          |
     * |______________________________|
     * | Employee Id   :         2564 |
     * | Employee Name :          Jay |
     * |______________________________|
     * | Basic Salary  :      25000.0 |
     * | HRA 10%       :       2500.0 |
     * | TA 8%         :       2250.0 |
     * | DA 9%         :       2000.0 |
     * | PF - 20&      :       5000.0 |
     * |______________________________|
     * | Gross Salary  :      26750.0 |
     * |==============================|
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employee name ex.Jay");
        String name = scan.nextLine();
        System.out.println("Enter Employee ID ex.2564");
        int id = scan.nextInt();
        System.out.println("Enter Basic Salary ex.25000");
        int salary = scan.nextInt();
        findGrossSalary(id, name, salary);
        scan.close();
    }

    public static void findGrossSalary(int employeeID, String name, int salary) {
        int hra = salary * 10 / 100;
        int da = salary * 8 / 100;
        int ta = salary * 9 / 100;
        int pf = salary * 20 / 100;
        int grossSalary = salary + hra + da + ta - pf;
        System.out.println("_______________________________");
        System.out.println("|         Salary Slip          |");
        System.out.println("|______________________________|");
        System.out.println("|Employee Id :           " + employeeID + "  |");
        System.out.println("|Employee Name :         " + name + "   |");
        System.out.println("|______________________________|");
        System.out.println("| Basic Salary  :       " + salary + "  |");
        System.out.println("| HRA 10%       :         " + hra +  " |");
        System.out.println("| DA 8%         :         " + da +  " |");
        System.out.println("| TA 9%         :         " + ta +  " |");
        System.out.println("| PF 20%        :         " + pf +  " |");
        System.out.println("|______________________________|");
        System.out.println("| Gross Salary  :      " + grossSalary + "   |");
        System.out.println("|______________________________|");

    }

}
