package pl.sda.obiektowosc.zad14;

import java.util.Arrays;

public class Zamowienie {
    private int maxRozmiar;
    private int pozycje[];

    public Zamowienie(int maxRozmiar) {
        this.maxRozmiar = maxRozmiar;
    }

    public void dodajPozycje(Pozycja pozycja){

    }

//    public double obliczWartosc(){
//
//    }

    @Override
    public String toString() {
        return "maxRozmiar= "+ maxRozmiar +", pozycje=" + Arrays.toString(pozycje);
    }
}

