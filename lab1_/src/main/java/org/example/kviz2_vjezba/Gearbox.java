package org.example.kviz2_vjezba;

public class Gearbox extends Component{
    private int numOfGears;
    public int getNumOfGears(){
        return this.numOfGears;

    }
    public void setNumOfGears(int number){
        this.numOfGears=number;
    }
    public Gearbox(int numOfGears,String name, int serialNumber,Manufacturer manufacturer){
        super(name,serialNumber,manufacturer);
        this.numOfGears=numOfGears;
    }
    @Override
    public String whichComponentAmI(){
        return "Gearbox";
    }

}
