package org.example.NightSky;

public class main {

    public static void main(String[] args) {

        NightSky nightSky = new NightSky(0.1, 40, 10);
        nightSky.printLine();
        nightSky.printLine2();
        System.out.println("Number of stars: " + nightSky.starsInLastPrint());
        nightSky.print();
        System.out.println("Number of stars: " + nightSky.starsInLastPrint());
    }
}
