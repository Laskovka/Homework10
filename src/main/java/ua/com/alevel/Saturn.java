package ua.com.alevel;

public class Saturn extends Planet implements PlanetAcceleration {
    private static Saturn instance;

    private Saturn() {
        setNameOfThePlanet("Saturn");
        setMassOfThePlanet(5.683 * Math.pow(10, 26));
        setRadiusOfThePlanet(58.232 * Math.pow(10, 6));
    }

    public static Saturn getInstance() {
        if (instance == null) {
            instance = new Saturn();
        }
        return instance;
    }

    @Override
    public double acceleration() {
        double g = AccelerationUtil.freeFallAcceleration(Saturn.this);
        return Math.round(g * 100.0) / 100.0;
    }
}
