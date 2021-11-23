package hu.progmatic.elelmiszer;

public class Bab extends Etel {

    public Bab(int mennyiseg) {
        super( mennyiseg);
    }


    @Override
    public String getNev(){
        return "Bab";
    }

    @Override
    public int getSzenhidrat() {
        return (161 * getMennyiseg()) / 1000;
    }

    @Override
    public int getFeherje() {
        return (74 * getMennyiseg()) / 1000;
    }

    @Override
    public int getZsir() {
        return (4 * getMennyiseg()) / 1000;
    }
}
