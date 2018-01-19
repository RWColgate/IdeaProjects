//zadanie 2
package pl.sda;

import java.util.Random;

public class Zad2 {
    public static void main(String[] args) {
        int[] tab = new int[5];


        generowanieRandomowejTablicy(tab);
        minElement(tab);
        maxElement(tab);
        sumaTablicy(tab);
        liczenieSredniej(tab);
        liczenieMediany(tab);
        //wypisanieTablicy(tab);


    }

    private static void generowanieRandomowejTablicy(int[] tab) {
        Random r = new Random();
        System.out.println("Generowanie randomowej tablicy: ");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt(100);
            System.out.print(tab[i]+ " ");
        }
        System.out.println();
    }

    private static void minElement(int[] tab) {
        int min = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (min > tab[i]) min = tab[i];
        }
        System.out.println("Min: " + min);
    }

    private static void maxElement(int[] tab) {
        int max = tab[0];
        for (int j = 0; j < tab.length; j++) {
            if (max < tab[j]) max = tab[j];
        }
        System.out.println("Max: " + max);
    }

    private static void sumaTablicy(int[] tab) {
        int suma = 0;
        for (int k = 0; k < tab.length; k++) {
            suma += tab[k];
        }
        System.out.println("Suma: " + suma);
    }

    private static void liczenieSredniej(int[] tab) {
        int srednia = 0, w = 0;
        for (int i = 0; i < tab.length; i++) {
            w += tab[i];
        }
        srednia = w / tab.length;
        System.out.println("Srednia: " + srednia);
    }

    private static void wypisanieTablicy(int[] tab) {
        System.out.println("Posortowana tabela: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " " );
        }
    }

    private static void liczenieMediany(int[] tab) {
        int pom;
        for (int i = 0; i < tab.length; i++)
            for (int j = 0; j < tab.length; j++) {
                if (tab[i] > tab[j]) {
                    pom = tab[i];
                    tab[i] = tab[j];
                    tab[j] = pom;
                }
            }
        int mediana = tab.length / 2;
        System.out.println("Mediana: " + tab[mediana]);
    }
}

//1