package org.example.NightSky;

import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private Random random;
    private int starsInLastPrint;


    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
        this.random = new Random();
        this.starsInLastPrint = 0;
    }


    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width = width;
        this.height = height;
        this.random = new Random();
        this.starsInLastPrint = 0;
    }


    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.random = new Random();
        this.starsInLastPrint = 0;
    }


    public void printLine() {

        for (int i = 0; i < width; i++) {
            if (random.nextDouble() <= density) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void printLine2() {


        for (int i = 0; i < width; i++) {
            if (random.nextDouble() <= density) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public void printLine3() {
        int starsThisLine = 0;


        for (int i = 0; i < width; i++) {
            if (random.nextDouble() <= density) {
                System.out.print("*");
                starsThisLine++;
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

        starsInLastPrint += starsThisLine;
    }


    public void print() {
        starsInLastPrint = 0;
        for (int i = 0; i < height; i++) {
            printLine();
        }
    }

    public int starsInLastPrint() {
        return starsInLastPrint;
    }
}
