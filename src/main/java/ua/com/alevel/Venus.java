package ua.com.alevel;

public class Venus extends Planet implements PlanetAcceleration {
    private static Venus instance;

    private Venus() {
        setNameOfThePlanet("Venus");
        setMassOfThePlanet(4.867 * Math.pow(10, 24));
        setRadiusOfThePlanet(6.0518 * Math.pow(10, 6));
    }

    public static Venus getInstance() {
        if (instance == null) {
            instance = new Venus();
        }
        return instance;
    }

    @Override
    public double acceleration() {
        double g = AccelerationUtil.freeFallAcceleration(Venus.this);
        return Math.round(g * 100.0) / 100.0;
    }
}
