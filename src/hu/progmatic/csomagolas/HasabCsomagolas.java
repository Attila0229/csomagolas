
package hu.progmatic.csomagolas;
public abstract class HasabCsomagolas extends Csomagolas{
    private final double magassag;

    public HasabCsomagolas(double magassag){
        this.magassag= magassag;
    }

    public double getMagassag() {
        return magassag;
    }
    @Override
    public final double getKapacitas(){
        return getMagassag()*getAlapTerulet();
    }

    public abstract double getAlapTerulet();
}
