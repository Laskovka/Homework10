package ua.com.alevel;

public class Earth extends Planet implements PlanetAcceleration {
    private static Earth instance;

    private Earth() {
        setNameOfThePlanet("Earth");
        setMassOfThePlanet(5.9742 * Math.pow(10, 24));
        setRadiusOfThePlanet(6.371 * Math.pow(10, 6));
    }

    public static Earth getInstance() {
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }

    @Override
    public double acceleration() {
        double g = AccelerationUtil.freeFallAcceleration(Earth.this);
        return Math.round(g * 10.0) / 10.0;
    }
}
