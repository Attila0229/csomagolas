package hu.progmatic.doboz._2_probalkozas;

import hu.progmatic.doboz.Ember;
import hu.progmatic.doboz._1_probalkozas.EmberDoboz;

public class Main {
    public static void main(String[] args) {
     mentesBetoltesProba(new MemoriaDoboz());
    }
    private static  void mentesBetoltesProba(Doboz doboz){
        //1. létrehozunk 1 embert
        Ember ember = new Ember("Kovács","József");
        doboz.setPeldany(ember);
        //2. Embert átnevezzük.
        ember.setKeresztnev("Lajos");
        ember.setVezeteknev("Nagy");
        System.out.println(ember.getNev());
        //3. Régi embert elmentjük a GC től
        MemoriaTarolo tarolo = new MemoriaTarolo();
        tarolo.setPeldany(ember);
        //4. Betöltjük az elmentett új embert
        ember = (Ember) doboz.getPeldany(new Ember());
        System.out.println(ember.getNev());
        //5. kiirjuk a régi embert
        tarolo.getPeldany();
    }}
