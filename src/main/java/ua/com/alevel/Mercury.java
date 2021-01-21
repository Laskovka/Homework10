package ua.com.alevel;

public class Mercury extends Planet implements PlanetAcceleration {
    private static Mercury instance;

    private Mercury() {
        setNameOfThePlanet("Mercury");
        setMassOfThePlanet(3.285 * Math.pow(10, 23));
        setRadiusOfThePlanet(2.4397 * Math.pow(10, 6));
    }

    public static Mercury getInstance() {
        if (instance == null) {
            instance = new Mercury();
        }
        return instance;
    }

    @Override
    public double acceleration() {
        double g = AccelerationUtil.freeFallAcceleration(Mercury.this);
        return Math.round(g * 10.0) / 10.0;
    }
}
