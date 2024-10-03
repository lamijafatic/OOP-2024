
/* LAB WEEK1 */
package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int number=5;
       /*1.*/
        System.out.println("My name is Lamija");
        /*2.*/
        System.out.println("Hello World");
        System.out.println(" (And all the people of the world)");
        /*3.*/

        int year=2024;
        System.out.println("In a year: "+year+" there are: "+secondsInAYear(year)+" seconds");
        /*4.*/
        System.out.println("Enter a number1: ");
        
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.println("Enter a number2: ");
        int number2 = Integer.parseInt(reader.nextLine());
        System.out.println("Sum is: " + (number1+number2));
        /*5* nastavljeno sa istim brjevima*/
        System.out.println("Enter a number again: ");
        int number3 = Integer.parseInt(reader.nextLine());
        if(number3>0)
            System.out.println("Number is positive");
        else if(number3<0) System.out.println("Number is negative");
        else System.out.println("Number is zero");
        /*6*/

        if(number1>number2)
            System.out.println("Number "+number1+" is greater than number "+number2);
        else if(number1<number2) System.out.println("Number"+number1+" is less than number "+number2);
        else System.out.println("They are equal");


    }


    public static int secondsInAYear (int year) {
        return (365*24*3600);
    }

}
