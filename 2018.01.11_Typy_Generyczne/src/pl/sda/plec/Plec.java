package pl.sda.plec;

public enum Plec {
    MEZCZYZNA ("Mezczyzna"),
    KOBIETA ("Kobieta"),
    SAMOLOT ("Samolot"),
    NIEZNANA ("N/A");

    private final String opis;

    Plec(String opis){
        this.opis = opis;
    }

    @Override
    public String toString() {
        return opis;
    }
}