package KsiazkaBibliotekazad7;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka {
    private List<Ksiazka> ksiazki;
    private List<Ksiazka> wypozyczona = new ArrayList<>();

    public Biblioteka(List<Ksiazka> ksiazki) {
        this.ksiazki = ksiazki;
    }

    public boolean czyKsiazkaDostepna(String nazwaKsiazki){
        for (Ksiazka ksiazka: ksiazki) {
            if(nazwaKsiazki.equals(ksiazka.getNazwa())){
                if(wypozyczona.contains(ksiazka)){
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    public void wypozyczKsiazke(String nazwaKsiazki){
        for (Ksiazka ksiazka: ksiazki) {
            if(nazwaKsiazki.equals(ksiazka.getNazwa())){
                wypozyczona.add(ksiazka);
            }
        }
    }
    public void wyswietlWypozyczone(){
        for(Ksiazka ksiazka : wypozyczona){
            System.out.println(ksiazka);
        }
    }

}
