package hu.progmatic.elelmiszer;

public class Oszibarack extends Etel {

    public Oszibarack( int mennyiseg) {
        super( mennyiseg);
    }

 @Override
 public String getNev(){
        return "Őszibarack";
 }

    @Override
    public int getSzenhidrat() {
        return (126 * getMennyiseg()) / 1000;
    }

    @Override
    public int getFeherje() {
        return (14 * getMennyiseg()) / 1000;
    }

    @Override
    public int getZsir() {
        return (4 * getMennyiseg()) / 1000;
    }
}
