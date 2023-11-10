package org.example;

import org.example.CLI.CLIMenu;
import org.example.UserManagement.UserManager;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        CLIMenu cliMenu = new CLIMenu(userManager);
/*
//        test registration
        userManager.registerUser("jbptst", "password1", "Student");
//        test login
        userManager.loginUser("jbptst", "password1");
        userManager.loginUser("julia", "password1");
*/
        cliMenu.displayMenu();
    }
}