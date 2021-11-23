package hu.progmatic.csomagolas;

public class Gombcsomagolas extends Csomagolas {
    private final double sugar;

    public Gombcsomagolas(double sugar) {
        this.sugar = sugar;
    }

    public double getSugar() {
        return sugar;
    }

    @Override
    public double getKapacitas() {
        return (4.0 / 3.0) * Math.pow( sugar,3) * Math.PI;
    }
}
