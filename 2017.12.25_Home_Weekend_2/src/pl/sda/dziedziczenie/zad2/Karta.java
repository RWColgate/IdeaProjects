package pl.sda.dziedziczenie.zad2;

import java.util.ArrayList;
import java.util.List;

public class Karta {
    Kolor kolor;
    Figura figura;

    public Karta(Kolor kolor, Figura figura) {
        this.kolor = kolor;
        this.figura = figura;
    }

    @Override
    public String toString() {
        String opis = String.format("%s %s", kolor.znaczek, figura.symbol);
        return opis;
    }

    public static void main(String[] args) {
        List talia = new ArrayList();

        for(int i=0 ;i<Kolor.values().length; i++){
            for(int j=0; j<Figura.values().length; j++){
                talia.add(new Karta(Kolor.values()[i], Figura.values()[j]));
            }
        }
        for(int i=0; i<5; i++){
        System.out.println(talia);
        }
    }
}
