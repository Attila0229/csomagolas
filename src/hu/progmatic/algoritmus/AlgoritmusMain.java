package hu.progmatic.algoritmus;

import hu.progmatic.csomagolas.Csomagolas;
import hu.progmatic.csomagolas.Gombcsomagolas;
import hu.progmatic.koszones.Ember;

public class AlgoritmusMain {
    public static void main(String[] args) {
        Csomagolas gomb = new Gombcsomagolas(1);
        gomb.setToltelek(1);
        Csomagolas gomb1 = new Gombcsomagolas(2);
        gomb1.setToltelek(4);
        Ember ember = new Ember("Szabó", "Helga");
        Ember ember1 = new Ember("Kovács", "Pisti");


        VanSulya[]sulyas = new VanSulya[]{gomb,gomb1,ember,ember1};
        System.out.println("Összes Súly: "+ Algoritmus.osszSuly(sulyas));

    VanTerfogat[] terfogats = new VanTerfogat[]{gomb,gomb1};
        System.out.println("Összes Térfogat: " + Algoritmus.osszTerfogat(terfogats));
        VanSurusege[] surusegek = new VanSurusege[]{gomb,gomb1};
        System.out.println("Átlagos sűrűség: " + Algoritmus.atlagSuruseg(surusegek));
}}
