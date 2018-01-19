package pl.sda.obiektowosc.zad1;

import java.util.*;

public class Samochod {
    private int predkosc = 0;
    private String kolor = null;
    private String marka;
    private int rocznik;

    private static final Random r = new Random();

    public Samochod(String kolor, String marka, int rocznik) {
        this.kolor = kolor;
        this.marka = marka;
        this.rocznik = rocznik;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int getPredkosc() {
        return predkosc;
    }

    @Override
    public String toString() {

        kolor.toLowerCase();
        String[] listaKolor = kolor.split("");
        listaKolor[0]=listaKolor[0].toUpperCase();
        StringBuffer wynikKolor = new StringBuffer("");

        for (String string:listaKolor)
            wynikKolor.append(string);

        kolor=wynikKolor.toString();

        return kolor + " " + marka + " rocznik " + rocznik;
    }


    public void przyspiesz() {
        int predkosc = getPredkosc();
        long current = System.currentTimeMillis();
        while(predkosc<140){
            if(System.currentTimeMillis() - current > 300){
                predkosc+=20;
                current = System.currentTimeMillis();
                System.out.printf("Przyspieszam %s do %d km/h\n",this.toString(),predkosc);
            }
        }
    }

}
