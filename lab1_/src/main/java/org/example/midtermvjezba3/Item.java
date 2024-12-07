package org.example.midtermvjezba3;

public class Item implements Sellable {
    private String barcode;
    private String name;
    private double price;
    @Override
    public double calculateDiscount(double discountRate){
        return price-price*discountRate;
    }
    @Override
    public String getDescription(){
        return "name:"+name+", barcode:"+barcode+", price:"+price;
    }
    public Item (String barcode,String name,double price){
        this.barcode = barcode;
        this.name = name;
        this.price = price;
    }
    public String getBarcode() {
        return barcode;
    }
    public void setBarcode(String barcode) {
        this.barcode=barcode;
    }
    public String getName() {
        return name;

    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


}
