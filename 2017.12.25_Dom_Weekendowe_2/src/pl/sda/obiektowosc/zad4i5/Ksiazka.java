package pl.sda.obiektowosc.zad4i5;

public class Ksiazka {
    private String nazwa;
    private String autor;
    private int rokWydania;

    public Ksiazka(String nazwa, String autor, int rokWydania) {
        this.nazwa = nazwa;
        this.autor = autor;
        this.rokWydania = rokWydania;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getAutor() {
        return autor;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public String toString() {
        return "'" + nazwa + "'" + ", " + autor + " " + rokWydania;
    }
}
