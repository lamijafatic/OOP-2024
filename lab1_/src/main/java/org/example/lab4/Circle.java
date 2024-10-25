package org.example.lab4;


import java.sql.SQLOutput;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, FillType filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public void displayCircleInfo(){
        displayInfo();
        System.out.println("Shape: Circle");
        System.out.println("Radius: " + radius);
        System.out.println("Area: "+calculateArea());

    }
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }
    public double calculateCircumference(double r) {
        return 2 * Math.PI * r;
    }
}
