package hu.progmatic.koszones.parlament;


public class MemoriaParlament extends Parlament {
    private String adat;

    @Override
    protected String load() {
        return adat;
    }

    @Override
    protected boolean save(String adat) {
        if (adat != null) {
            this.adat = adat;
            return true;
        } else return false;
    }


}
