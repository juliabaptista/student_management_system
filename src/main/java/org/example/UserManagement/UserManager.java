package org.example.UserManagement;

import java.util.HashMap;

public class UserManager {
    private HashMap<String, User> userDatabase;

    public UserManager() {
        this.userDatabase = new HashMap<>();
    }

    public void registerUser(String username, String password, String role) {
//        check if the username already exists
        if (userDatabase.containsKey(username)) {
            System.out.println("Username already exists. Choose another username.");
        } else {
//            in case not, create a new user and add it to the database
            User newUser = new User(username, password, role);
            userDatabase.put(username, newUser);
            System.out.println("Registration successful!");
        }
    }

    public boolean loginUser(String username, String password) {
//        check if the username already exists
        if (userDatabase.containsKey(username)) {
//            check if the password is correct
            User user = userDatabase.get(username);
            if (user.getPassword().equals(password)) {
                System.out.println("Login successful! Welcome, " + user.getUsername() + "!");
                return true;
            } else {
                System.out.println("Incorrect password. Please try again.");
            }
        } else {
            System.out.println("Username not found. Please register first.");
        }
        return false;
    }
}
