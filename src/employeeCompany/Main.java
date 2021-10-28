package employeeCompany;

import java.util.Scanner;

import static employeeCompany.EmployeeMaangement.*;
import static employeeCompany.Statistics.*;
import static employeeCompany.UI.*;
import static employeeCompany.Utilitiess.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean loop = true;

        while (loop) {

            mangmentPorjct();
            int input = readInt();

            if (input == 1) {
                employeeMeny();
                makeEmployeeSwitch();

            } else if (input == 2) {
                statistics();
                makeEmployeeStatistics();
            } else if (input == 0) {
                loop = false;
            } else {
                System.out.println("There is no such option. Try again.");
            }
        }
    }

    public static void loadB() {

        Employee e1 = new Employee(1, "Linda", "Jon", 23, 50000, 1012, "women");
        Employee e2 = new Employee(1, "John", "John", 23, 45000, 1012, "man");
        Employee e3 = new Employee(1, "Mira", "Mery", 26, 30000, 1012, "women");
        Employee e4 = new Employee(1, " Tom", " Tomy", 34, 25000, 1012, "man");
        Employee e5 = new Employee(1, "Bill", "Billy", 55, 60000, 1012, "man");
        Employee e6 = new Employee(1, "Lin", "Linna", 43, 70000, 1012, "women");
        Employee e7 = new Employee(1, "Mia", "Miaa", 19, 80000, 1012, "women");

        loadEmployee(e1);
        loadEmployee(e2);
        loadEmployee(e3);
        loadEmployee(e4);
        loadEmployee(e5);
        loadEmployee(e6);
        loadEmployee(e7);


    }

}





