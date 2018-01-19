package pl.sda.interfejsy.zadanie3;

public class Pokarm {
    private String nazwa;
    private TypPokarmu typPokarmu;
    private int waga;

    public Pokarm(String nazwa, TypPokarmu typPokarmu, int waga) {
        this.nazwa = nazwa;
        this.typPokarmu = typPokarmu;
        this.waga = waga;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getWaga() {
        return waga;
    }

    public TypPokarmu getTypPokarmu() {
        return typPokarmu;
    }

    public int pobierzWage() {
        return this.waga;
    }

    public int ilePosilkow() {
//        return this.g;
    return 0;
    }
}
