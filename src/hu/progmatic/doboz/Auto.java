package hu.progmatic.doboz;

import hu.progmatic.doboz._2_probalkozas.Mentheto;

public class Auto implements Mentheto {
    private String rendszam;
    private String marka;

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }


    public Auto(String marka,String rendszam) {
        this.rendszam = rendszam;
        this.marka = marka;
    }

    public String getRendszam() {
        return rendszam;
    }

    public String getMarka() {
        return marka;
    }

    public String getAuto() {
        return marka + ";" + rendszam;
    }

    @Override
    public String szerializal() {
        return marka + ";" + rendszam;
    }

    @Override
    public void deszeriializal(String adat) {
        String[] reszek = adat.split(";");
         this.marka = reszek[0];
         this.rendszam = reszek[1];
    }
}
