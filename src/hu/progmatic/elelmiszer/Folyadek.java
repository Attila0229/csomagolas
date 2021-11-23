package hu.progmatic.elelmiszer;

public abstract class Folyadek {
    private int mennyiseg;

    public Folyadek() {
    }

    public Folyadek(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public abstract String getNev();

    public final int getTapertek() {
        return (getTapertekPerDL() * getMennyiseg()) / 100;
    }

    public abstract int getTapertekPerDL();
}
