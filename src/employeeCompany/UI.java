package employeeCompany;


import java.util.Scanner;


public class UI {

    public static Scanner sc = new Scanner(System.in);

    public static void mangmentPorjct() {
        System.out.println("============= Welcome to Mangement Project =============");
        System.out.println("===Make Your Choice===");
        System.out.println("1. Employee Mangement ");
        System.out.println("2. Employee Statistics");
        System.out.println("3. Exit");
        //readInt();
    }

    public static void employeeMeny() {


        System.out.println("========\nWelcome to the Employee Management System========");
        System.out.println("1. Register employee");
        System.out.println("2. Delete employee");
        System.out.println("3. Update name of employee");
        System.out.println("4. Update the birthday of employee");
        System.out.println("5. Update the department of employee");
        System.out.println("6. Update Salary of employee");
        System.out.println("7. Search employee by name");
        System.out.println("8. Search employee by id");
        System.out.println("9. Search employee  by department");
        System.out.println("10.Display all employess");
        System.out.println("0. Exit");

    }

    public static void statistics() {

        System.out.println("""
                  1.    Average wage at the company
                  2.    Maximum salary in the company
                  3.    Minimum salary in the company
                  4.    Total bonus
                  5.    Women percentage in the company
                  6.    Men percentage of the various work role categories
                  0.    Back to Main Menu

                """);
    }

}


