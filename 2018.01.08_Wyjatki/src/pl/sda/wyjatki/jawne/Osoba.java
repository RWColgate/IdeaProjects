package pl.sda.wyjatki.jawne;

public class Osoba {
    private String imie;
    private int rokUrodzenia;

    public Osoba(String imie, int rokUrodzenia) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
    }

    public int pobierzRokUrodzenia() {
        return this.rokUrodzenia;
    }
}
