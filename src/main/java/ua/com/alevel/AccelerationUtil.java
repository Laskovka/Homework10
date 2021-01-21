package ua.com.alevel;

public final class AccelerationUtil {
    static double freeFallAcceleration(Planet planet) {
        return (planet.G * planet.getMassOfThePlanet()) / Math.pow(planet.getRadiusOfThePlanet(), 2);
    }
}
