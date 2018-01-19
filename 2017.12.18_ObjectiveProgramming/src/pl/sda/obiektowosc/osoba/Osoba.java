package pl.sda.obiektowosc.osoba;

import java.util.Scanner;

public class Osoba {
    String imie;
    int rokUrodzenia;

    public Osoba(String imie, int rokUrodzenia) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chcesz wyswietlic, Panow czy Panie");
        String kogoWyswietlic = scanner.nextLine();

        Osoba ania = new Osoba("Ania", 1992);
        Osoba andrzej = new Osoba("Andrzej", 1963);
        Osoba mariola = new Osoba("Mariola", 1949);

        Osoba[] osoby = new Osoba[]{ania,andrzej,mariola};

        for(int i=0; i<osoby.length; i++){
            if(kogoWyswietlic.equalsIgnoreCase("Panie") && osoby[i].imie.endsWith("a")){
            osoby[i].wyswietlDane();
            }
            else if( kogoWyswietlic.equalsIgnoreCase("Panow") && !osoby[i].imie.endsWith("a")){
                osoby[i].wyswietlDane();
            }
        }
    }
    void wyswietlDane(){
        int ileLat = 2017-rokUrodzenia;
        System.out.println("Czesc! Mam na imie " + imie + " i mam "+ileLat + " lat.");
    }
}
