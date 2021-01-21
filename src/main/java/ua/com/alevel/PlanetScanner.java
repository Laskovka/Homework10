package ua.com.alevel;

import java.util.Scanner;

public class PlanetScanner {
    public static void main(String[] args) {
        Planet[] arrayOfPlanets = new Planet[]{
                Mercury.getInstance(), Venus.getInstance(),
                Earth.getInstance(), Mars.getInstance(),
                Jupiter.getInstance(), Saturn.getInstance(),
                Uranus.getInstance(), Neptune.getInstance()};
        Scanner scanner = new Scanner(System.in);

        System.out.println("We have " + arrayOfPlanets.length + " planets.");
        String planets = "There are ";
        for (int i = 0; i < arrayOfPlanets.length; i++) {
            planets += arrayOfPlanets[i].getNameOfThePlanet() + "(" + (i + 1) + "), ";
        }
        planets = planets.substring(0, planets.length() - 2);
        System.out.println(planets + ".");
        System.out.println("Enter the number of the planet whose free fall acceleration you want to know.");
        int numberOfPlanet = scanner.nextInt();
        System.out.println(PlanetReported.allInformationAboutFreeFallAcceleration(arrayOfPlanets[numberOfPlanet-1]));
    }
}
