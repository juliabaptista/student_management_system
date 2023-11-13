package org.example;

import org.example.CLI.CLIMenu;
import org.example.Course.Course;
import org.example.Course.CourseManager;
import org.example.Student.Student;
import org.example.Student.StudentManager;
import org.example.UserManagement.UserManager;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        CLIMenu cliMenu = new CLIMenu(userManager);

        StudentManager studentManager = new StudentManager();
        CourseManager courseManager = new CourseManager();

//        create a new student and a new course
        Student student1 = new Student("S01", "Julia Baptista");
        Student student2 = new Student("S02", "Fernanda Brugger");
        Course course1 = new Course("C01", "Java");
        Course course2 = new Course("C02", "Python");

//        add student and course
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        courseManager.addCourse(course1);
        courseManager.addCourse(course2);
        System.out.println("Students: " + studentManager.getAllStudents());
        System.out.println("Courses: " + courseManager.getAllCourses());

//        delete student and course
        studentManager.deleteStudent("S01");
        courseManager.deleteCourse("C01");
        System.out.println("Students after deletion: " + studentManager.getAllStudents());
        System.out.println("Courses after deletion: " + courseManager.getAllCourses());


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
