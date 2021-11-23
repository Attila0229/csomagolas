package hu.progmatic.elelmiszer;

public class OszibarackLe extends Folyadek{

    public OszibarackLe() {
    }

    public OszibarackLe(int mennyiseg) {
        super(mennyiseg);
    }

    @Override
    public String getNev() {
        return "ŐszibarackLé";
    }


    @Override
    public int getTapertekPerDL() {
        return 44;
    }
}
