package hu.progmatic.csomagolas;

import java.util.Scanner;

public class CsomagolasMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Csomagolas csomagolas = new HengerCsomagolas(131,21);
     //   Csomagolas csomagolas1 = new TeglaTestCsomagalas(22,10,6.5);
        System.out.println("A csomagolás kapacitása: " + Math.round(csomagolas.getKapacitas()) + ".");
        System.out.println("Mennyi folyadékot szeretnél a csomagolásba tölteni");
        double toltelek = scanner.nextDouble();

        try {
            csomagolas.setToltelek(toltelek);
            System.out.println("SIKER: Az új töltelék mennyisége: " + csomagolas.getToltelek());
        } catch (RuntimeException e) {
            System.out.println("HIBA: Ennyi folyadék nem fér bele!");
        }
    }
}
