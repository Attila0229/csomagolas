package hu.progmatic.doboz._1_probalkozas;

public final class EmberMemoriaDoboz extends EmberDoboz{
        private String adat;

    @Override
    public String megnyitas() {
        return adat;
    }

    @Override
    public boolean mentes(String adat) {
        if(adat != null){
            this.adat=adat;
            return true;
        }else
        return false;
    }
}
