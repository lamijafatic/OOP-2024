package org.example.midterm_vjezba;

public class Drink extends MenuItem{
    private double volume;
    public Drink(String name,double price,String code,double volume){
        super(code,name,price);
        this.volume=volume;

    }
    @Override
    public String getDescription(){
        return (""+this.volume);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

}
