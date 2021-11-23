package hu.progmatic.elelmiszer;

public class Bor extends  Folyadek{

    public Bor() {
    }

    public Bor(int mennyiseg) {
        super(mennyiseg);
    }

    @Override
    public String getNev() {
        return "Bor";
    }

    @Override
    public int getTapertekPerDL() {
        return 83;
    }
}
