package hu.progmatic.algoritmus;

public class Algoritmus {

    public static double osszSuly(VanSulya[] sulyok) {
        double osszSuly = 0.0;
        for (VanSulya suly : sulyok) {
            if (suly != null)
                osszSuly += suly.getSuly();
        }
        return osszSuly;
    }

    public static double osszTerfogat(VanTerfogat[] terfogatok){
        double osszTerfogat = 0.0;
        for (VanTerfogat terfogat : terfogatok) {
            if (terfogat != null){
                osszTerfogat += terfogat.getTerfogat();
            }
        }return osszTerfogat;
    }

    public static double atlagSuruseg(VanSurusege[] surusegek){
        return osszSuly(surusegek) / osszTerfogat(surusegek);
    }
}
