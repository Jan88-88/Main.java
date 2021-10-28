package employeeCompany;


import static employeeCompany.EmployeeMaangement.*;
import static employeeCompany.UI.*;
import static employeeCompany.Utilitiess.*;


public class Statistics {

    public static void makeEmployeeStatistics() {
        System.out.println("\nMake your choise");
        int input = readInt();

        switch (input) {
            case 1:
                averageWage();
                break;
            case 2:
                maxSalary();
                break;
            case 3:
                minimumSalary();
                break;
            case 4:
                giveBonusToAllWithoutBonus();
                break;
            case 5:
                womenPercentage();
                break;
            case 6:
                menPercentage();
                break;
            case 0:
                System.out.println("Back to Main Menu\n");
                mangmentPorjct();
                break;
            default:
                System.out.println("\nEnter a correct choice from the List, Try Again");


        }

    }



}
