package ua.com.alevel;

public class Jupiter extends Planet implements PlanetAcceleration {
    private static Jupiter instance;

    private Jupiter() {
        setNameOfThePlanet("Jupiter");
        setMassOfThePlanet(1.8986 * Math.pow(10, 27));
        setRadiusOfThePlanet(69.911 * Math.pow(10, 6));
    }

    public static Jupiter getInstance() {
        if (instance == null) {
            instance = new Jupiter();
        }
        return instance;
    }

    @Override
    public double acceleration() {
        double g = AccelerationUtil.freeFallAcceleration(Jupiter.this);
        return Math.round(g * 100.0) / 100.0;
    }
}
