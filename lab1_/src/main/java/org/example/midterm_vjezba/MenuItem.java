package org.example.midterm_vjezba;

public abstract class MenuItem implements Billable{
    String code;
    String name;
    double price;

    public MenuItem(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    @Override
    public double applyDiscount(double discountRate) {
        return 0;
    }
    @Override
    public String getDescription() {
        return null;
    }
    private String getCode(){
        return this.code;
    }
    private String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    private void setCode(String code){
        this.code = code;
    }
    private void setName(String name){
        this.name=name;
    }
    private void setPrice(double price){
            this.price=price;
    }

}
