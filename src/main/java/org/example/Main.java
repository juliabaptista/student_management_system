package org.example;

import org.example.UserManagement.UserManager;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

//        test registration
        userManager.registerUser("jbptst", "password1", "Student");
//        test login
        userManager.loginUser("jbptst", "password1");
        userManager.loginUser("julia", "password1");
    }
}