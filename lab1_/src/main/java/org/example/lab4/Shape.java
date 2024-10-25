package org.example.lab4;

public class Shape {
    private String color;
    private FillType filled;

    public Shape(String color, FillType filled) {
        this.color = color;
        this.filled = filled;
    }
    public void displayInfo(){
        System.out.println("Color: " + color);
        System.out.println("Fill: " + FillType.FILLED);

    }

}
