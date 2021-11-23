package hu.progmatic.doboz._1_probalkozas;

import hu.progmatic.doboz.Auto;

public abstract class AutoDoboz {

    public final Auto getAuto (){
        String adat = megnyitas();
        return deszerializal(adat);
    }
    public final void setAuto(Auto auto){
        String adat = szerializal(auto);
        mentes(adat);

    }
    public abstract String megnyitas();

    public abstract boolean mentes(String adat);

    private String szerializal (Auto auto){
        return auto.getMarka() + ";" + auto.getRendszam();
    }

    private Auto deszerializal(String adat){
        String[] reszek = adat.split(";");
        return new Auto(reszek[0],reszek[1]);
    }
}
