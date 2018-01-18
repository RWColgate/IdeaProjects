package pl.sda.zadania.zadanie_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProgamList {
    private static final Random r = new Random();

    public List<Integer> wypelniajListe(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(20));
        }
        return list;
    }

    public Integer[] wypelniajTablice(Integer[] tablica) {
        for (int i = 0; i < 10; i++) {
            tablica[i] = r.nextInt(20);
        }
        return tablica;
    }

    public void wypiszTablice(Integer[] tablica) {
        System.out.printf("[");
        for (int i = 0; i < 10; i++) {
            System.out.print(tablica[i] + ", ");
        }
        System.out.printf("]");
    }

    public void porownajTabliceIListe(Integer[] tablica, List<Integer> list) {
        int ile = 0;
        for (int i = 0; i < 10; i++) {
            if (list.get(i) == tablica[i]) {
                ile++;
            }
        }
        System.out.println("\nPowtarzaja sie: " + ile + " elementow");
    }
}
