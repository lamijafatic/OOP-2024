package org.example.lab4;

public class Teacher extends Person {
    private int salary;

    public Teacher(String name, String address, int age, String country, int salary) {
        super(name, address, age, country);
        this.salary = salary;
    }

    public String getTeacherDetails(){
        return getDetails()+"\nsalary "+salary+" euros/month";
    }
}
