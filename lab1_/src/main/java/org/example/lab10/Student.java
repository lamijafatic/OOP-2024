package org.example.lab10;

import java.util.List;

public class Student {
    private String name;
    private String id;
    private List<Integer> grades;

    public Student(String name, String id, List<Integer> grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public void printInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Student name: " + name);
        System.out.println("Grades: " + grades);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<Integer> getGrades() {
        return grades;
    }
}
