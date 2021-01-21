package ua.com.alevel;

public class Planet implements PlanetAcceleration {
    public final double G = 6.67 * Math.pow(10, -11);
    private String nameOfThePlanet;
    private double massOfThePlanet;
    private double radiusOfThePlanet;

    public String getNameOfThePlanet() {
        return nameOfThePlanet;
    }

    public void setNameOfThePlanet(String nameOfThePlanet) {
        this.nameOfThePlanet = nameOfThePlanet;
    }

    public double getMassOfThePlanet() {
        return massOfThePlanet;
    }

    public void setMassOfThePlanet(double massOfThePlanet) {
        this.massOfThePlanet = massOfThePlanet;
    }

    public double getRadiusOfThePlanet() {
        return radiusOfThePlanet;
    }

    public void setRadiusOfThePlanet(double radiusOfThePlanet) {
        this.radiusOfThePlanet = radiusOfThePlanet;
    }

    @Override
    public double acceleration() {
        return 0;
    }
}
