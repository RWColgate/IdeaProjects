package pl.sda.obiektowosc.zad10i11;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private int miesieczneWynagrodzenie;

    public Pracownik(String imie, String nazwisko, int miesieczneWynagrodzenie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miesieczneWynagrodzenie = miesieczneWynagrodzenie;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getMiesieczneWynagrodzenie() {
        return miesieczneWynagrodzenie;
    }

    public void setMiesieczneWynagrodzenie(int miesieczneWynagrodzenie) {
        this.miesieczneWynagrodzenie = miesieczneWynagrodzenie;
    }
}
