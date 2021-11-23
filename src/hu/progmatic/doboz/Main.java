package hu.progmatic.doboz;

import hu.progmatic.doboz._1_probalkozas.AutoDoboz;
import hu.progmatic.doboz._1_probalkozas.AutoMemoriaDoboz;
import hu.progmatic.doboz._1_probalkozas.EmberDoboz;
import hu.progmatic.doboz._1_probalkozas.EmberMemoriaDoboz;

public class Main {
    public static void main(String[] args) {
        mentesBetoltesProba(new EmberMemoriaDoboz());
        mentesBetoltesProba(new AutoMemoriaDoboz());

    }

    private static  void mentesBetoltesProba(EmberDoboz emberDoboz){
        Ember ember = new Ember("Kovács","József");
        emberDoboz.setEmber(ember);

        ember.setKeresztnev("Lajos");
        ember.setVezeteknev("Nagy");
        System.out.println(ember.getNev());

        ember = emberDoboz.getember();
        System.out.println(ember.getNev());
    }
    private static  void mentesBetoltesProba(AutoDoboz autoDoboz){
        Auto auto = new Auto("Audi","AAA-111");
        autoDoboz.setAuto(auto);

        auto.setRendszam("HWD-444");
        auto.setMarka("BMW");
        System.out.println(auto.getMarka() + ";"+ auto.getRendszam());

        auto = autoDoboz.getAuto();
        System.out.println(auto.getAuto());
    }
}
