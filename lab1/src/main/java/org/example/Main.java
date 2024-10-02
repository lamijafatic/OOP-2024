package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Hello and welcome!");

        int number=5;
        System.out.print("f");
        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
        System.out.println("My name is Lamija");
        System.out.println("Hello World");
        System.out.println(" (And all the people of the world)");
        System.out.println(square(number));
        int year=2024;

        System.out.println("In a year: "+year+" there are: "+secondsInAYear(year)+" seconds");

        System.out.println("Enter a number1: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.println("Enter a number2: ");
        int number2 = Integer.parseInt(reader.nextLine());
        System.out.println("Sum is: " + number1+number2);
        if(number1>number2)
            System.out.println("Number 1 is greater");
        else if(number1<number2) System.out.println("Number 1 is less");
        else System.out.println("They are equal");
        System.out.println("Enter a number again: ");
        int number3 = Integer.parseInt(reader.nextLine());
        if(number3>0)
            System.out.println("Number is positive");

    }

    public static int square(int number) {
        return number*number;
    }
    public static int secondsInAYear (int year) {
        return (365*24*3600);
    }

}