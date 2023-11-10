package org.example.UserManagement;

import java.util.Arrays;

public class UserManager {
    //    using Arrays and Loops
    private User[] users;

    public UserManager() {
        this.users = new User[10];
    }

    public void registerUser(String username, String password, String role) {
//        check if the username already exists
        if (getUserByUsername(username) != null) {
            System.out.println("Username already exists. Choose another username.");
        } else {
//            in case not, create a new user and add it to the database
            User newUser = new User(username, password, role);
            addUser(newUser);
            System.out.println("Registration successful!");
        }
    }

    public boolean loginUser(String username, String password, String role) {
        for (int i = 0; i < users.length; i++) {
            User user = users[i];
            if (user != null
                    && user.getUsername().equals(username)
                    && user.getPassword().equals(password)
                    && user.getRole().equals(role)) {
                System.out.println("Login successful! Welcome, " + user.getUsername() + "!");
                return true;
            }
        }
        System.out.println("Login failed. Please check your credentials.");
        return false;
    }

    //    CRUD operations
    private void addUser(User newUser) {
//    find the first available index in the array
        int i = findEmptyIndex();
        if (i != -1) {
            users[i] = newUser;
        } else {
//        i = -1 means the array is full
            System.out.println("User limit reached. Unable to add more users.");
        }
    }

    private int findEmptyIndex() {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                return i;
            }
        }
//        if the array is full, return -1
        return -1;
    }

    public void deleteUser(String username) {
        User userToDelete = getUserByUsername(username);
        if (userToDelete != null) {
//            delete the user by setting the array element to null
            int index = Arrays.asList(users).indexOf(userToDelete);
            users[index] = null;
            System.out.println("User deleted successfully.");
        } else {
            System.out.println("User not found.");
        }
    }

    private User getUserByUsername(String username) {
        for (User user : users) {
            if (user != null && user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public void displayUsers() {
        System.out.println("________ User List ________");
        for (int i = 0; i < users.length; i++) {
            User user = users[i];
            if (user != null) {
                System.out.println(user);
            }
        }
    }
}
