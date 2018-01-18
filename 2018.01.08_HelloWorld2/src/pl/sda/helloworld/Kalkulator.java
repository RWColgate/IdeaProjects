package pl.sda.helloworld;

public class Kalkulator {
    public int dodaj(int... tab) {
        int suma=0;
        for (int i = 0; i < tab.length; i++) {
            suma += tab[i];
        }
        return suma;
    }

    public int odejmij(int[] tab) {
        int suma=0;
        for (int i = 0; i < tab.length; i++) {
            suma -= tab[i];
        }
        return suma;
    }
}
