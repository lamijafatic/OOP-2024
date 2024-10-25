package org.example.lab4;
import org.example.lab4.Person;

import java.util.List;

public class Student extends Person{
    private int credits;
   private String student_id;
   private List<Integer> grades;

    public Student(String name, String address, int age, String country, int credits, String student_id, List<Integer> grades) {
        super(name, address, age, country);
        this.credits = credits;
        this.student_id = student_id;
        this.grades = grades;
    }

    public String getStudent_id() {
        return student_id;
    }
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Grade " + grade + " added successfully.");
        } else {
            System.out.println("Invalid grade. Please enter a value between 0 and 100.");
        }
    }
    public void displayStudentInfo() {
        super.displayPersonInfo();
        System.out.println("Student ID: " + student_id);
        System.out.println("Grades: " + grades);
    }
    public List<Integer> getGrades() {
        return grades;
    }
    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public int credits(){
        return credits;
    }
    public void study(){
        credits++;
    }
     public String getStudentDetails(){
        return getDetails();
     }
}
