package employeeCompany;

import java.util.Scanner;


import static employeeCompany.Utilitiess.*;

public class EmployeeMaangement {

    static Employee[] employees = new Employee[50];

    static Scanner sc = new Scanner(System.in);
    private static int val;
    public static int nextFreeEmployee = 0;


    public static void makeEmployeeSwitch() {

        System.out.println("\nMake your choice");
        val = readInt();


        switch (val) {
            case 1:
                registerEmployee();
                break;
            case 2:
                deleteEmployee();
                break;
            case 3:
                uppdateFirstName();
                break;
            case 4:
                uppdateBirthday();
                break;
            case 5:
                updateDepartment();
                break;
            case 6:
                updateSalary();
                break;
            case 7:
                searchName();
                break;
            case 8:
                searchEmployeeById();
                break;
            case 9:
                searchByDepartment();
                break;
            case 10:
                displayAllEmployess();
                break;
            case 0:
                System.out.println("The program ends!");
                break;
            default:
                System.out.println("Enter a correct choice from the list, Try Again");

        }

    }

    public static void loadEmployee(Employee e) {
        employees[nextFreeEmployee] = e;
        nextFreeEmployee++;
    }


    public static void registerEmployee() {

        Employee em = new Employee();

        System.out.print("Enter Your ID:  ");
        em.setId(readInt());

        System.out.print("Enter Your First Name:  ");
        em.setFirstName(readString());

        System.out.print("Enter your last name:  ");
        em.setLastName(readString());

        System.out.print("Enter your birthday:  ");
        em.setBirthday(readInt());

        System.out.print("Enter your salary:  ");
        em.setSalary(readDouble());

        System.out.print("Enter your department:  ");
        em.setDepartment(readDouble());

        employees[nextFreeEmployee++] = em;
        //nextFreeEmployee++;

    }


    public static void deleteEmployee() {
        displayAllEmployess();

        System.out.println("id");
        int id = readInt();

        for (int i = 0; i < nextFreeEmployee; i++) {

            if (employees[i].getId() == id) {
                System.out.println("ID: " + id);

                System.out.println(employees[i] + "Deleted");

                employees[i] = employees[nextFreeEmployee - 1];
                nextFreeEmployee--;
            }

        }
    }


    public static void uppdateFirstName() {
        displayAllEmployess();

        System.out.print("Id:");
        int id = readInt();

        System.out.print("New name");
        String name = readString();

        for (int i = 0; i < nextFreeEmployee; i++) {

            if (employees[i].getId() == id) {
                employees[i].setFirstName(name);
            }
        }

    }


    public static void displayAllEmployess() {

        for (int i = 0; i < nextFreeEmployee; i++) {
            System.out.println(employees[i]);
        }
    }


    public static void uppdateBirthday() {
        displayAllEmployess();

        System.out.print("Enter id: ");
        int id = readInt();

        System.out.print("Enter new birthday: ");
        int newBirthday = readInt();

        for (int i = 0; i < nextFreeEmployee; i++) {

            if (employees[i].getId() == id) {
                employees[i].setBirthday(newBirthday);
                System.out.println(employees[i]);
            }
        }
    }


    public static void updateDepartment() {
        displayAllEmployess();

        System.out.print("Enter id:");
        int id = readInt();

        System.out.print("Enter new department:");
        int newDep = readInt();

        for (int i = 0; i < nextFreeEmployee; i++) {

            if (employees[i].getId() == id) {
                employees[i].setDepartment(newDep);
                System.out.println(employees[i]);
            }
        }
    }


    public static void updateSalary() {
        displayAllEmployess();

        System.out.print("Enter id:");
        int id = readInt();

        System.out.print("Enter new salary:");
        double newSalary = readDouble();

        for (int i = 0; i < nextFreeEmployee; i++) {

            if (employees[i].getId() == id) {
                employees[i].setSalary(newSalary);
            }
        }

    }


    public static void searchName() {
        displayAllEmployess();

        System.out.print("Enter name you want to search:");
        String searchName = readString();

        boolean found = false;

        for (int i = 0; i < nextFreeEmployee; i++) {

            if (searchName.equals(employees[i].getFirstName())) {
                found = true;
                System.out.println(employees);
            }

        }
        if (found == false) {
            System.out.println("Cannot find specified name");
        }
    }


    public static void searchEmployeeById() {

        System.out.print("Search Employee by id:");
        int id = readInt();

        boolean found = false;

        for (int i = 0; i < nextFreeEmployee; i++) {

            if (employees[i].getId() == id) {
                found = true;
                System.out.println(employees[i]);
            }
        }

        if (found == false) {
            System.out.println("Cannot find specified ID, Try again");
        }

    }


    public static void searchByDepartment() {
        displayAllEmployess();

        System.out.print("Enter department you want to search:");
        int department = readInt();

        boolean found = false;
        for (int i = 0; i < nextFreeEmployee; i++) {

            if (employees[i].getDepartment() == department) {
                found = true;
                System.out.println(employees[i]);

            }
        }

        if (found == false) {

            System.out.println("No employees in that department");
        }


    }


    public static void averageWage() {
        double sum = 0;

        for (int i = 0; i < nextFreeEmployee; i++) {

            sum = sum + employees[i].getSalary();

        }
        System.out.println("Average age is: " + sum / nextFreeEmployee);
    }


    public static void maxSalary() {

        int maxSal = 0;

        for (int i = 1; i < nextFreeEmployee; i++) {
            if (employees[i].getSalary() > employees[maxSal].getSalary())
                // maxSal = maxSal + empMan[i].getSalary();
                maxSal = i;

        }
        System.out.print("Max salary in company is:" + employees[maxSal]);
    }


    public static void minimumSalary() {
        int miniSal = 0;

        for (int i = 1; i < nextFreeEmployee; i++) {
            if (employees[i].getSalary() < employees[miniSal].getSalary())
                miniSal = i;
        }
        System.out.print("Max salary in company is:" + employees[(int) miniSal]);
    }


    public static void giveBonusToAllWithoutBonus() {

        for (int i = 0; i < nextFreeEmployee; i++) {

            employees[i].setSalary(employees[i].getSalary() * 1.10);
        }

    }


    public static void womenPercentage() {
        int women = 0;

        for (int i = 0; i < nextFreeEmployee; i++) {
            if (employees[i].getGender().equalsIgnoreCase("female")) {
                women++;
            }
        }

        System.out.println("Procentage women are " + women / nextFreeEmployee * 100 + "%");


    }


    public static void menPercentage() {
        int man = 0;

        for (int i = 0; 1 < nextFreeEmployee; i++) {
            if (employees[i].getGender().equalsIgnoreCase("man")) {
                man++;
            }
        }
        System.out.println("Procentage man are" + man / nextFreeEmployee * 100 + "%");
    }


}