package hu.progmatic.csomagolas;

public class TeglaTestCsomagalas extends HasabCsomagolas {
    private final double szelesseg;
    private final double hosszusag;

    public TeglaTestCsomagalas(double szelesseg, double hosszusag,double magassag) {
        super(magassag);
        this.szelesseg = szelesseg;
        this.hosszusag = hosszusag;
    }


    public double getSzelesseg() {
        return szelesseg;
    }

    public double getHosszusag() {
        return hosszusag;
    }

    @Override
    public final double getAlapTerulet(){
        return getHosszusag()*getSzelesseg();
    }
}
