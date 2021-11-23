package hu.progmatic.doboz;

import hu.progmatic.doboz._2_probalkozas.Mentheto;

public class Ember implements Mentheto {
    private String vezeteknev;
    private String keresztnev;

    public Ember(){

    }

    public Ember(String vezeteknev, String keresztnev) {
        this.vezeteknev = vezeteknev;
        this.keresztnev = keresztnev;
    }


    public String getVezeteknev() {
        return vezeteknev;
    }

    public void setVezeteknev(String vezeteknev) {
        this.vezeteknev = vezeteknev;
    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public void setKeresztnev(String keresztnev) {
        this.keresztnev = keresztnev;
    }
    public String getNev(){
        return vezeteknev+ " "+ keresztnev;
    }

    @Override
    public String szerializal() {
        return vezeteknev +";"+keresztnev;
    }

    @Override
    public void deszeriializal(String adat) {
        String[] reszek = adat.split(";");
        this.vezeteknev = reszek[0];
        this.keresztnev = reszek[1];
    }
}
