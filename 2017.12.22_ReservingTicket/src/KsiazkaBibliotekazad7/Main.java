package KsiazkaBibliotekazad7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ksiazka> ksiazki = new ArrayList<>();

        ksiazki.add(new Ksiazka("Biblia", "1423", "1956", "Luter"));
        ksiazki.add(new Ksiazka("Wiedzmin", "1432","1900","Sapkowski"));
        ksiazki.add(new Ksiazka("Swiat Dysku", "1333","2009","Prachet"));

        Biblioteka biblioteka = new Biblioteka(ksiazki);

        System.out.println("Czy 'Mumia' dostepna? " + biblioteka.czyKsiazkaDostepna("Mumia"));
        System.out.println("Czy 'Wiedzmin' dostepny? " + biblioteka.czyKsiazkaDostepna("Wiedzmin"));

        biblioteka.wypozyczKsiazke("Wiedzmin");
        biblioteka.wyswietlWypozyczone();

        System.out.println("Czy 'Wiedzmin' dostepny? " + biblioteka.czyKsiazkaDostepna("Wiedzmin"));

    }

}
