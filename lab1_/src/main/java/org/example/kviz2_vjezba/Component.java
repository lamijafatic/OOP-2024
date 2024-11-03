package org.example.kviz2_vjezba;

public class Component {
    private String name;
    private int serialNumber;
    private Manufacturer manufacturer;

public Manufacturer getManufacturer() {
    return this.manufacturer;
}
public void setManufacturer(Manufacturer manufacturer) {
    this.manufacturer = manufacturer;
}

    public String getName(){
        return this.name;
    }
    public int getSerialNumber(){
        return this.serialNumber;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSerialNumber(int number){
        this.serialNumber=number;
    }
   public Component(String name, int serialNumber, Manufacturer manufacturer){
        this.name=name;
        this.serialNumber=serialNumber;
        this.manufacturer=manufacturer;

   }
   public String whichComponentAmI(){
        return "Component";
   }


}
