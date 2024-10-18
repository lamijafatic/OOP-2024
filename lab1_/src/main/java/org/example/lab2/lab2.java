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



        }

        System.out.println(suma(3));
       printText(3);
       drawStarsPiramid(7);
        System.out.println(" ");
       obrnutaPiramida(8);
        System.out.println(" ");
        drawStarsPiramidNumbers(7);
        /*10*/
        int brojZaPogoditi=56;
        int brojilo=0;
        System.out.println("Guess the number: ");
        int guess= reader.nextInt();
        while (guess!=brojZaPogoditi) {
            if (guess>brojZaPogoditi) {
                brojilo++;
                System.out.println("Lower!- This is your " + brojilo + "guess");
                 guess= reader.nextInt();
            }
            else if (guess<brojZaPogoditi) {
                brojilo++;
                System.out.println("Higher!- This is your " + brojilo + "guess");
                guess= reader.nextInt();
            }
            }
        System.out.println("You are correct!");
        System.out.println("You made "+brojilo+" guesses");
        }



    /*5*/
    public static int suma(int n){
        int suma=0;
        for(int i=0;i<=n;i++){
            suma=suma+(int)Math.pow(2,i);
        }
        return suma;
    }

    /*6*/
    public static void printText (int n){
        String recenica="In the beginning there were the swamp, the hoe and Java\n";
        for(int i=0;i<n;i++){
            System.out.println(recenica);
        }
    }
    /*7*/
    public static void drawStarsPiramid(int n){
        for (int i=0;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    /*8*/
    public static void obrnutaPiramida(int n){

        for(int i=n-1;i>=0;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    /*9*/
    public static void drawStarsPiramidNumbers(int n){
        for (int i=0;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }



}

