package org.example.CLI;

import org.example.UserManagement.UserManager;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CLIMenu {
    private UserManager userManager;

    public CLIMenu(UserManager userManager) {
        this.userManager = userManager;
    }

    public void displayMenu() {
        boolean exit = false;
        Scanner sc = new Scanner(System.in);

        while (!exit) {
            System.out.println("________ Options ________");
            System.out.println("1. User Management");
            System.out.println("2. Student Management");
            System.out.println("3. Course Management");
            System.out.println("4. Grading System");
            System.out.println("5. Search and Sort");
            System.out.println("6. Save and Load Data");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("USER MANAGEMENT METHODS");
                    break;
                case 2:
                    System.out.println("STUDENT MANAGEMENT METHODS");
                    break;
                case 3:
                    System.out.println("COURSE MANAGEMENT METHODS");
                    break;
                case 4:
                    System.out.println("GRADING SYSTEM METHODS");
                    break;
                case 5:
                    System.out.println("SEARCH AND SORT METHODS");
                    break;
                case 6:
                    System.out.println("SAVE AND LOAD DATA METHODS");
                    break;
                case 0:
                    exit = true;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
