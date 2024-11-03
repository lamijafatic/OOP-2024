package org.example.kviz2_vjezba;
import java.lang.Math;

public class Circle extends Shape {
    private double radius;
    public Circle(String color, FillType filltype, double radius){
        super(color,filltype);
        this.radius=radius;
    }
    @Override
    public void displayInfo(){
        System.out.println("Radious is additional: "+this.radius);
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

}
