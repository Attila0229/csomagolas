package hu.progmatic.koszones;

import hu.progmatic.koszones.Ember;
import hu.progmatic.koszones.magyar.MagyarEmber;
import hu.progmatic.koszones.parlament.FajlParlament;
import hu.progmatic.koszones.parlament.MemoriaParlament;
import hu.progmatic.koszones.parlament.Parlament;

public class KoszonesMain {
    public static void main(String[] args) {
        Ember ember = new Ember("Gipsz", "Jakab");
        Ember magyar = new MagyarEmber("Cá", "Pali");
        ember.koszon();
        magyar.koszon();
        System.out.println();
        System.out.println("----------------------");
        System.out.println("Miniszter");
        System.out.println("----------------------");
      //  Parlament parlament = new MemoriaParlament();
         Parlament parlament1 = new FajlParlament("C:\\Users\\attil\\Desktop\\Teszt\\save.txt");  //létező mappa kell hozzá!!
        parlament1.setMiniszterelnok(ember);
        Ember miniszterelnok = parlament1.getMiniszterelnok();
        System.out.println("A Miniszterelnök:");
        miniszterelnok.koszon();

    }
}
