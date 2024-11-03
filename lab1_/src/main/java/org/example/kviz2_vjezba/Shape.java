package org.example.kviz2_vjezba;

public class Shape {
    private String color;
    private FillType fillType;
    public Shape(String color, FillType fillType){
        this.color=color;
        this.fillType=fillType;
    }
    public void displayInfo(){
        System.out.println("Color: "+this.color+"\nFillType: "+this.fillType);
    }

}
