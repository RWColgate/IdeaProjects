package pl.sda.obiektowosc.zad14;

public class Pozycja {
    private String nazwaTowaru;
    private int iloscSztuk;
    private double cenaSztuki;

    public Pozycja(String nazwaTowaru, int iloscSztuk, double cenaSztuki) {
        this.nazwaTowaru = nazwaTowaru;
        this.iloscSztuk = iloscSztuk;
        this.cenaSztuki = cenaSztuki;
    }

    public String getNazwaTowaru() {
        return nazwaTowaru;
    }

    public int getIloscSztuk() {
        return iloscSztuk;
    }

    public double getCenaSztuki() {
        return cenaSztuki;
    }

    @Override
    public String toString() {
        return nazwaTowaru + " " + cenaSztuki + "zł " + iloscSztuk + "szt. " + (cenaSztuki*iloscSztuk) + "zł ";
    }

    public void obliczWarotsc() {
        double wartosc = 0;


    }
}
