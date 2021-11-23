package hu.progmatic.doboz._2_probalkozas;

public final class MemoriaDoboz extends Doboz{
   private String adat;

    @Override
    public String megnyitas() {
        return adat;
    }

    @Override
    public boolean mentes(String adat) {
        this.adat =adat;
        return true;
    }


}
