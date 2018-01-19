package pl.sda.obiektowosc.zgadnijhaslo;

import java.util.Random;

public class ZgadnijHaslo {
    private int numer;
    private int odZakres;
    private int doZakres;

    public ZgadnijHaslo(int numer, int odZakres, int doZakres) {
        this.odZakres = odZakres;
        this.doZakres = doZakres;
    }

    public int getNumer() {
        return numer;
    }

    public void generujLiczbe() {
        Random r = new Random();
        numer = r.nextInt(doZakres - odZakres) + odZakres;
        System.out.println(numer);
    }

    void sprawdzCzyWygrales(int zmienna) {
        if (zmienna == numer) {
            System.out.println("Gratulacje wygrales");
        } else {
            if (numer > zmienna) System.out.println("Musisz strzelac wyzej");
            else if (numer < zmienna) System.out.println("Musisz strzelac nizej");
        }
    }
}
