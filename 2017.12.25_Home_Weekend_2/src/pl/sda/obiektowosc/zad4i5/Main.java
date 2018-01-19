package pl.sda.obiektowosc.zad4i5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Ksiazka ksiazka1 = new Ksiazka("Krzyzacy", "Henryk Sienkiewiz", 2004);
        Ksiazka ksiazka2 = new Ksiazka("Honor zlodzieja", "Douglas Hulick", 2012);
        Ksiazka ksiazka3 = new Ksiazka("Bieganie metoda Hallowaya", "Jeff Galloway", 2011);

        List<Ksiazka> ksiazkaList = new ArrayList<Ksiazka>();
        ksiazkaList.add(ksiazka1);
        ksiazkaList.add(ksiazka2);
        ksiazkaList.add(ksiazka3);

        //tworzymy biblioteke ktora ma ksiazki co wyzej stworzylismy liste
        Biblioteka biblioteka = new Biblioteka(ksiazkaList);

        //testujemy kazda metode z biblioteki

        Ksiazka ksiazka4 = new Ksiazka("Testowa Ksiazka", "KtosKtos", 9999);
        biblioteka.dodajKsiazke(ksiazka4);

        System.out.println("Sprawdzam czy ksiazka krzyzacy jest w systemie");
        System.out.println(biblioteka.czyKsiazkaDostepna("Krzyzacy"));

        System.out.println("Wypozyczam ksiazke krzyzacy");
        biblioteka.wypozyczKsiazke("Krzyzacy");

        System.out.println("Wyswietlam wypozyczone ksiazki");
        biblioteka.wyswietlWypozyczoneKsiazki();

        System.out.println("Wypisuje ksiazki w bibliotece");
        biblioteka.wyswietlDostepneKsiazki();

    }

    private static void wypisywanieKsiazek(List<Ksiazka> ksiazkaList) {
        for (int i = 0; i < ksiazkaList.size(); i++) {
            System.out.println(ksiazkaList.get(i).toString());
        }
    }


}

