package hu.progmatic.doboz._1_probalkozas;

import java.util.Scanner;

public final class EmberKonzolDoboz extends EmberDoboz{


    @Override
    public String megnyitas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adatok megnyitása:");
                return scanner.nextLine();
    }

    @Override
    public boolean mentes(String adat) {
        System.out.println("Adat Mentése:");
        System.out.println(adat);
        return true;
    }
}
