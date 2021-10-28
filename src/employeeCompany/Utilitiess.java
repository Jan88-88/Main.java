package employeeCompany;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Utilitiess {
   static Scanner sc = new Scanner(System.in);

    public static int readInt() {
        int tal = -1;
        boolean loop = true;

        while (loop) {
            try {
                tal = sc.nextInt();
                loop = false;

            } catch (InputMismatchException e) {

                System.out.println("Only numeric numbers, Thanks");
                System.out.println("Try Again!");
                System.out.println("Write only numbers:");
            } finally {
                sc.nextLine();
            }

        }
        return tal;
    }

    public static double readDouble() {
        double tal = -1;
        boolean loop = true;

        while (loop) {
            try {
                tal = sc.nextDouble();
                loop = false;
            } catch (InputMismatchException e) {
                System.out.println("Only numeric numbers, Thanks");
                System.out.println("Try Again");
                System.out.println("Write only numbers");
            } finally {
                sc.nextLine();
            }

        }
        return tal;
    }

    public static String readString() {
        String s = "";
        boolean loop = true;

        //String s ;
        while (loop) {
            try {
                s= sc.nextLine();
                loop = false;

            } catch (InputMismatchException e) {
                System.out.println("Only text you can write");
                System.out.println("Try Again");
                System.out.println("Write only text");

            }

        }
        return s;


    }


}
