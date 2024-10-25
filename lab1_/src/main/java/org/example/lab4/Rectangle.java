package org.example.lab4;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String color, FillType filled, double width, double height) {

        super(color, filled);
        this.width = width;
        this.height = height;
    }
    public void displayRectangleInfo() {
        displayInfo();
        System.out.println("Shape: Rectangle");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + calculateArea());
    }
    public double calculateArea() {
        return width * height;
    }
}

