package ua.com.alevel;

public class PlanetReported {
    public static String allInformationAboutFreeFallAcceleration(Planet planet) {
        return "The name of the planet is " +
        planet.getNameOfThePlanet() +
        ".\n" +
        "Free fall acceleration - " +
        planet.acceleration() +
        ".";
    }
}
