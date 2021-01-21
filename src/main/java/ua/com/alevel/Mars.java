package ua.com.alevel;

public class Mars extends Planet implements PlanetAcceleration {
    private static Mars instance;

    private Mars() {
        setNameOfThePlanet("Mars");
        setMassOfThePlanet(6.39 * Math.pow(10, 23));
        setRadiusOfThePlanet(3.3895 * Math.pow(10, 6));
    }

    public static Mars getInstance() {
        if (instance == null) {
            instance = new Mars();
        }
        return instance;
    }

    @Override
    public double acceleration() {
        double g = AccelerationUtil.freeFallAcceleration(Mars.this);
        return Math.round(g * 100.0) / 100.0;
    }
}
