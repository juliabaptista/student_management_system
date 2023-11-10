package org.example.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private List<Course> courses;

    public CourseManager() {
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void deleteCourse(String courseId) {
        courses.removeIf(course -> course.getCourseId().equals(courseId));
    }

    public Course getCourseById(String courseId) {
        return courses.stream()
                .filter(course -> course.getCourseId().equals(courseId))
                .findFirst()
                .orElse(null);
    }

    public List<Course> getAllCourses() {
        return new ArrayList<>(courses);
    }
}
