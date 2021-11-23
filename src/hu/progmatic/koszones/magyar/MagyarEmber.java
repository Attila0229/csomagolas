package hu.progmatic.koszones.magyar;

import hu.progmatic.koszones.Ember;

public class MagyarEmber extends Ember {

    public MagyarEmber(String vezeteknev, String keresztnev) {
        super(vezeteknev, keresztnev);
    }

    @Override
    public String getNev() {
        return getVezeteknev() + " " + getKeresztnev();
    }

    @Override
    protected String getEloTag(){
        return "Hello! Én ";
    }
    @Override
    protected String getUtoTag (){
        return " vagyok!";
    }


}
