package hu.progmatic.koszones;

import hu.progmatic.algoritmus.VanSulya;

public class Ember implements VanSulya {
    private final String keresztnev;
    private final String vezeteknev;

    public Ember (String vezeteknev, String keresztnev){
        this.keresztnev=keresztnev;
        this.vezeteknev=vezeteknev;
    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public String getNev(){
        return keresztnev + " " + vezeteknev;
    }

    public final void koszon(){
        System.out.println(getEloTag() + getNev() + getUtoTag());
    }
    // Hely "Ügyfeles pluginnek
    // Placeholder
    protected String getEloTag(){
        return "Hello! I am ";
    }
    // Placeholder (Változó Referencia)
    protected String getUtoTag(){
        return "!";
    }

    @Override
    public final double getSuly() {
        return 75.0;
    }

    @Override
    public String getTipusa() {
        return "Ember";
    }
}
