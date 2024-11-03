package org.example.kviz2_vjezba;

public class Wheel extends Component{
    private int diameter;
    public int getDiameter(){
        return this.diameter;
    }
    public void setDiameter(int diameter){
        this.diameter=diameter;
    }
    public Wheel(int diameter,String name, int serialNumber,Manufacturer manufacturer){
        super(name,serialNumber,manufacturer);
        this.diameter=diameter;

    }
    @Override
    public String whichComponentAmI(){
        return "Wheel";
    }
}
