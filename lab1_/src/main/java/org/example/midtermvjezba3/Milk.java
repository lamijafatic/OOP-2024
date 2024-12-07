package org.example.midtermvjezba3;

public class Milk extends Item{
    private double fat;
    public Milk(String barcode,String name,double price,double fat){
        super(barcode,name,price);
        this.fat=fat;
    }
    @Override
    public String getDescription(){
        return "fat: "+this.fat;
    }
    public void setFat(double fat){
        this.fat=fat;
    }
    public double getFat(){
        return this.fat;
    }
}
