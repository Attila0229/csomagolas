package hu.progmatic.elelmiszer;

public final class Viz extends Folyadek{
    public Viz() {
    }

    public Viz(int mennyiseg) {
        super(mennyiseg);
    }

    @Override
    public String getNev() {
        return "Viz";
    }

    @Override
    public int getTapertekPerDL() {
        return 0;
    }
}
