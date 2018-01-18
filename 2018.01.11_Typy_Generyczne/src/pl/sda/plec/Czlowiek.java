package pl.sda.plec;

public class Czlowiek {
    String imie;
    String nazwisko;
    Plec plec;

    public Czlowiek(String imie, String nazwisko, Plec plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
    }

    public Plec pobierzPlec(){
        return plec;
    }

    @Override
    public String toString() {
        return String.format("%s : %s %s", plec, imie, nazwisko);
    }
}