package hu.progmatic.doboz._1_probalkozas;

import hu.progmatic.doboz.Ember;

public abstract class EmberDoboz {
    public final Ember getember(){
        String adat = megnyitas();
        return deszerializal(adat);
    }
    public final void setEmber(Ember ember){
        String adat = szerializal(ember);
        mentes(adat);

    }
    public abstract String megnyitas();

    public abstract boolean mentes(String adat);

    private String szerializal ( Ember ember){
        return ember.getVezeteknev() + ";" + ember.getKeresztnev();
    }

    private Ember deszerializal(String adat){
        String[] reszek = adat.split(";");
        return new Ember(reszek[0],reszek[1]);
    }
}
