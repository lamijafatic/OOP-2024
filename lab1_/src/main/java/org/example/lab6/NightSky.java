package org.example.lab6;

import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsCount;
    private Random random;


    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.random = new Random();
        this.starsCount = 0;
    }


    public void print() {
        this.starsCount = 0;
        for (int i = 0; i < height; i++) {
            printLine();
        }
    }


    private void printLine() {
        for (int j = 0; j < width; j++) {
            if (random.nextDouble() <= density) {
                System.out.print("*");
                starsCount++;
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }


    public int starsInLastPrint() {
        return starsCount;
    }

}
