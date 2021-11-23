package hu.progmatic.elelmiszer;

public class EtelMain {

    public static void main(String[] args) {
        Etel kaja;
        kaja = new Bab(350);
        System.out.println(kaja.getMennyiseg() + "g " + kaja.getNev() + "-nak tápértéke: " + kaja.getTapertek() + "kcal");
        System.out.println(kaja.getNev() + " " + kaja.getMakroNutriens(MakroNutriens.FEHERJE) + "g fehérjét tartalmaz.");


        Folyadek folyadek;
        folyadek = new Bor(200);
        System.out.println(folyadek.getMennyiseg() + "ml " + folyadek.getNev() + "tápértéke: " + folyadek.getTapertek() + "kcal");


        System.out.println("-------------------------------");
        System.out.println("Levesek");
        System.out.println("--------------------------------");
        Leves forraltbor = new Leves(null, new Bor(200));
        Leves gyumolcsLeves = new Leves(new AntilopHus(210), new OszibarackLe(500));
        Leves husLeves = new Leves(new AntilopHus(500), new Viz(1000));
        levesKiir(forraltbor);
        levesKiir(gyumolcsLeves);
        levesKiir(husLeves);
    }

    public static void levesKiir(Leves leves) {
        System.out.println(leves);
        if (leves.getEtel() != null) {
            Etel etel = leves.getEtel();
            System.out.println(etel.getMennyiseg() + "g " + etel.getNev() + "-nak tápértéke: " + etel.getTapertek() + "kcal");
        }
        if (leves.getFolyadek() != null) {
            Folyadek folyadek = leves.getFolyadek();
            System.out.println(folyadek.getMennyiseg() + "ml " + folyadek.getNev() + "tápértéke: " + folyadek.getTapertek() + "kcal");
        }

    }
}
