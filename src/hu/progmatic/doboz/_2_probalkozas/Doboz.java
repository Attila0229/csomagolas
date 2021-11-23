package hu.progmatic.doboz._2_probalkozas;

public abstract class Doboz{


    public final Mentheto getPeldany(Mentheto uresPeldany){
      String adat = megnyitas();
    uresPeldany.deszeriializal(adat);
    return uresPeldany;
    }

    public final void setPeldany(Mentheto mentheto){
        String adat = mentheto.szerializal();
        mentes(adat);
    }
    public abstract String megnyitas();

    public abstract boolean mentes(String adat);
}
