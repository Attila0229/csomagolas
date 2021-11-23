package hu.progmatic.koszones.parlament;

import hu.progmatic.koszones.Ember;

public abstract class Parlament {

    public final Ember getMiniszterelnok() {
        String adat = load();
        return deszerializal(adat);
    }

    public final void setMiniszterelnok(Ember ember) {
        String adat = szerializal(ember);
        save(adat);

    }
    // Placeholder
    protected abstract String load();
    protected abstract boolean save(String adat);

    private String szerializal(Ember ember) {
        return ember.getVezeteknev() + "," + ember.getKeresztnev();
    }


    private Ember deszerializal(String emberadat) {
        String[] reszek = emberadat.split(",");
        return new Ember(reszek[0], reszek[1]);
    }
}
