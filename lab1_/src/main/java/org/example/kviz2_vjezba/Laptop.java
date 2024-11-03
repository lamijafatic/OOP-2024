package org.example.kviz2_vjezba;

import java.util.Random;

public class Laptop extends Proizvod{
    private String procesor;
    private int ram;


    public Laptop(String procesor,int ram,String model,GodineGarancije godineGarancije){
        super(model,godineGarancije);
        this.procesor=procesor;
        this.ram=ram;

    }
    @Override
    public void prikaziDetalje(){
        System.out.println(this.procesor+""+this.ram);

    }

    public int izracunajCijenu2(int osnovnaCijena){
        Random broj2=new Random();
        int broj33=broj2.nextInt(50,200);
        return osnovnaCijena+broj33;
    }
}
