package pl.sda.interfejsy.zadanie4;

public class Main {
    public static void main(String[] args) {
        Wiatrak wiatrak = new Wiatrak();
        Klimatyzacja klimatyzacja = new Klimatyzacja();


        Farelka farelka = new Farelka();
        Grzeje farekja_dwa = new Farelka();


        klimatyzacja.wyswietlTemp();
        klimatyzacja.zwiekszTemp();
        klimatyzacja.wyswietlTemp();
        klimatyzacja.schlodz();
        klimatyzacja.wyswietlTemp();
    }
}
