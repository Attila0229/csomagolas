package hu.progmatic.elelmiszer;

public abstract class Etel {
    private int mennyiseg;

    public Etel( int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }


    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }


    public abstract String getNev();

    public final int getMakroNutriens(MakroNutriens makroNutriens) {
        switch (makroNutriens) {
            case SZENHIDRAT:
                return getSzenhidrat();
            case FEHERJE:
                return getFeherje();
            case ZSIR:
                return getZsir();
        }
        throw new RuntimeException();
    }


    public final int getTapertek() {
        return 4 * getSzenhidrat() + 4 * getFeherje() + 9 * getZsir();
    }

    public abstract int getSzenhidrat();

    public abstract int getFeherje();

    public abstract int getZsir();
}
