package pl.sda.obiektowosc.zad4i5;


import java.util.ArrayList;
import java.util.List;

public class Biblioteka {
    List<Ksiazka> spisKsiazekwBibliotece = new ArrayList<Ksiazka>();
    List<Ksiazka> spisKsiazekWypozyczonych = new ArrayList<Ksiazka>();
    Ksiazka ksiazka;

    public Biblioteka(List<Ksiazka> spisKsiazekwBibliotece) {
        this.spisKsiazekwBibliotece = spisKsiazekwBibliotece;
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        spisKsiazekwBibliotece.add(ksiazka);
    }

    public boolean czyKsiazkaDostepna(String nazwaKsiazki) {
        for (Ksiazka ksiazka : spisKsiazekwBibliotece) {
            if (ksiazka.getNazwa().equals(nazwaKsiazki)) return true;
        }
        return false;
//        return spisKsiazekwBibliotece.contains(ksiazka.getNazwa().equals(nazwaKsiazki));
    }

    public void wypozyczKsiazke(String nazwaKsiazki) {
        for (int i = 0; i < spisKsiazekwBibliotece.size(); i++) {
            ksiazka = spisKsiazekwBibliotece.get(i);
            if (ksiazka.getNazwa().equals(nazwaKsiazki)) {
                spisKsiazekwBibliotece.remove(ksiazka);
                spisKsiazekWypozyczonych.add(ksiazka);
            }
        }
    }

    public void wyswietlWypozyczoneKsiazki() {
        for (int i = 0; i < spisKsiazekWypozyczonych.size(); i++) {
            System.out.println(spisKsiazekWypozyczonych.get(i).toString());
        }
    }

    public void wyswietlDostepneKsiazki() {
        for (int i = 0; i < spisKsiazekwBibliotece.size(); i++) {
            System.out.println(spisKsiazekwBibliotece.get(i).toString());
        }
    }
}
