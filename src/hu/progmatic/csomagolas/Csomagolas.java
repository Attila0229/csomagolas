package hu.progmatic.csomagolas;


import hu.progmatic.algoritmus.VanSulya;
import hu.progmatic.algoritmus.VanSurusege;
import hu.progmatic.algoritmus.VanTerfogat;

public abstract class Csomagolas implements VanSurusege {
    private double toltelek;

    public final double getToltelek() {
        return toltelek;
    }

    public final void setToltelek(double toltelek) {
        if (toltelek > getKapacitas()) {
            throw new RuntimeException();
        }
        this.toltelek = toltelek;
    }

    public abstract double getKapacitas();

    @Override
    public final double getSuly() {
        return toltelek;
    }

    @Override
    public double getTerfogat() {
        return getKapacitas();
    }

    @Override
    public String getTipusa() {
        return "Csomagolás";
    }

    @Override
    public double getSuruseg() {
        return getSuly() / getTerfogat();
    }
}
