package hu.progmatic.elelmiszer;

public final class AntilopHus extends Etel {

    public AntilopHus( int mennyiseg) {

        super( mennyiseg);
    }

    @Override
    public String getNev(){
        return "Antilop-hús";
    }


    @Override
    public int getSzenhidrat() {
        return 0;
    }

    @Override
    public int getFeherje() {
        return (224 * getMennyiseg()) / 1000;
    }

    @Override
    public int getZsir() {
        return (20 * getMennyiseg()) / 1000;
    }
}
