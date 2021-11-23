package hu.progmatic.csomagolas;

public class HengerCsomagolas extends HasabCsomagolas {
    private final double sugar;

    public HengerCsomagolas(double magassag, double sugar) {
        super(magassag);
        this.sugar= sugar;
    }

    public double getSugar() {
        return sugar;
    }

    @Override
    public final double getAlapTerulet(){
        return (sugar*sugar)*Math.PI*getMagassag();
    }
}
