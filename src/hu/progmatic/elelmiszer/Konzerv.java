package hu.progmatic.elelmiszer;

import hu.progmatic.algoritmus.VanSurusege;
import hu.progmatic.csomagolas.Csomagolas;

public final class Konzerv implements VanSurusege {
    private Csomagolas csomagolas;
    private Etel etel;


    public Konzerv(){}

    public Konzerv(Csomagolas csomagolas, Etel etel){
        this.csomagolas = csomagolas;
        this.etel = etel;
    }

    public Csomagolas getCsomagolas() {
        return csomagolas;
    }

    public void setCsomagolas(Csomagolas csomagolas) {
        this.csomagolas = csomagolas;
    }

    public Etel getEtel() {
        return etel;
    }

    public void setEtel(Etel etel) {
        this.etel = etel;
    }


    @Override
    public double getSuly() {
        return csomagolas.getSuly();
    }

    @Override
    public double getSuruseg() {
        return csomagolas.getSuruseg();
    }

    @Override
    public double getTerfogat() {
        return csomagolas.getTerfogat();
    }

    @Override
    public String getTipusa() {
        return "Konzerv";
    }
    public int getTapertek(){
        return etel.getTapertek();
    }

    public int getMennyiseg(){
        return etel.getMennyiseg();
    }
    public void setMennyiseg(int mennyiseg){
        etel.setMennyiseg( mennyiseg);
    }
}
