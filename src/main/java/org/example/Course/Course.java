package org.example.Course;

import org.example.Student.Student;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private String name;
    private List<Student> enrolledStudents;

    public Course(String courseId, String name) {
        this.courseId = courseId;
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", name='" + name + '\'' +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }
}
