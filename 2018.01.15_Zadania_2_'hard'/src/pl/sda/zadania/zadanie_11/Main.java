package pl.sda.zadania.zadanie_11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProgamList progamList = new ProgamList();

        List<Integer> list = new ArrayList<>();
        Integer[] tablica = new Integer[10];

        progamList.wypelniajListe(list);
        progamList.wypelniajTablice(tablica);

        System.out.println(list);
        progamList.wypiszTablice(tablica);

        progamList.porownajTabliceIListe(tablica,list);

        List
    }


}
