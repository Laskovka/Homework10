package ua.com.alevel;

public class Neptune extends Planet implements PlanetAcceleration {
    private static Neptune instance;

    private Neptune() {
        setNameOfThePlanet("Neptune");
        setMassOfThePlanet(1.024 * Math.pow(10, 26));
        setRadiusOfThePlanet(24.622 * Math.pow(10, 6));
    }

    public static Neptune getInstance() {
        if (instance == null) {
            instance = new Neptune();
        }
        return instance;
    }

    @Override
    public double acceleration() {
        double g = AccelerationUtil.freeFallAcceleration(Neptune.this);
        return Math.round(g * 100.0) / 100.0;
    }
}
