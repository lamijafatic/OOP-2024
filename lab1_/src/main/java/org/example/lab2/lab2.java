package org.example.lab2;

import java.util.Scanner;

public class lab2 {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String tacna_sifra="admin";
        String sifra="";
        /*1*/
        while (sifra != tacna_sifra) {
            System.out.println("Enter password please!");
            sifra = reader.nextLine();
            if (sifra.equals(tacna_sifra)) {
                System.out.println("Correct! Secret is nothing");
                break;
            }
            else System.out.println("Incorrect, try again!");
        }

       /*2*/
        System.out.println("Insert three numbers!");
        int number1=reader.nextInt();
        int number2=reader.nextInt();
        int number3=reader.nextInt();
        int sum=number1+number2+number3;
        System.out.println("Sum is "+sum);

       /*3*/
       int unos=1;
       int zbir=0;
        while(unos!=0){
            unos=reader.nextInt();
            zbir+=unos;

        }
        System.out.println("Sum of numbers is "+zbir);
  /*4*/
        System.out.println("unesi početak pa kraj: ");
        int pocetak= reader.nextInt();
        int kraj= reader.nextInt();
        if (kraj<pocetak)
            System.out.println("Invalid inputs");
        else{
        while(pocetak<=kraj) {
            System.out.println(pocetak);
            pocetak++;
        }
   /*5*/


        }
    }
}
