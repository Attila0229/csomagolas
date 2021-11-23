package hu.progmatic.elelmiszer;

public final class Leves {
    private Etel etel;
    private Folyadek folyadek;

    public Leves() {
    }

    public Leves(Etel etel, Folyadek folyadek) {
        this.etel = etel;
        this.folyadek = folyadek;
    }

    public Etel getEtel() {
        return etel;
    }

    public void setEtel(Etel etel) {
        this.etel = etel;
    }

    public Folyadek getFolyadek() {
        return folyadek;
    }

    public void setFolyadek(Folyadek folyadek) {
        this.folyadek = folyadek;
    }

    public int getTapertek() {
        return etel.getTapertek() + folyadek.getTapertek();
    }

    @Override
    public String toString() {
        String osszetevok = "";

        if (folyadek != null) {
            osszetevok += folyadek.getMennyiseg() + " ml " + folyadek.getNev();
        }

        if (etel != null) {
            if (folyadek != null) {
                osszetevok += " + ";
            }

            osszetevok += etel.getMennyiseg() + " g " + etel.getNev();
        }

        return osszetevok;
    }
}