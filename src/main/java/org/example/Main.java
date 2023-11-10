package org.example;

import org.example.CLI.CLIMenu;
import org.example.UserManagement.UserManager;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        CLIMenu cliMenu = new CLIMenu(userManager);

//        test registration and display users
        userManager.registerUser("jbptst", "password1", "Student");
        userManager.registerUser("fbrugger", "password2", "Teacher");
        userManager.displayUsers();

//        test login
        userManager.loginUser("jbptst", "password1", "Student");
        userManager.loginUser("julia", "password1", "Teacher");

//        test delete and display users
        userManager.deleteUser("jbptst");
        userManager.displayUsers();

        cliMenu.displayMenu();
    }
}