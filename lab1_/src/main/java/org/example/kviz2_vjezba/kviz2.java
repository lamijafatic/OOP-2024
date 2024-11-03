package org.example.kviz2_vjezba;

public class kviz2 {
    public static void main(String[] args){
        Wheel tocak =new Wheel(4,"Tocaka",3,Manufacturer.BMW);
        System.out.println(tocak.whichComponentAmI());
        Gearbox gearbox = new Gearbox(4, "jj",3, Manufacturer.VW);
        System.out.println("Component: " + gearbox.whichComponentAmI());
        System.out.println("Number of Gears: " + gearbox.getNumOfGears());

    }
}
