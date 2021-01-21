package ua.com.alevel;

public class Uranus extends Planet implements PlanetAcceleration {
    private static Uranus instance;

    private Uranus() {
        setNameOfThePlanet("Uranus");
        setMassOfThePlanet(8.681 * Math.pow(10, 25));
        setRadiusOfThePlanet(25.362 * Math.pow(10, 6));
    }

    public static Uranus getInstance() {
        if (instance == null) {
            instance = new Uranus();
        }
        return instance;
    }

    @Override
    public double acceleration() {
        double g = AccelerationUtil.freeFallAcceleration(Uranus.this);
        return Math.round(g * 100.0) / 100.0;
    }
}
