package com.pjatk.zadania;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class zadanie_42 {
    public static final Random r = new Random();
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        pobierzWielkoscListy();
        dodajRandomoweLiczbyDoListy(integerList,pobierzWielkoscListy());
        sprawdzaElementyNieparzyste(integerList);
    }

    private static void sprawdzaElementyNieparzyste(List<Integer> integerList) {
        int wynik = 0, ile = 0;
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) % 2 != 0) {
                System.out.println("Element nieparzysty: " + ile++ + "= " + integerList.get(i));
                wynik += integerList.get(i);
            }
        }
        System.out.println("Suma wszystkich liczb nieparzystych: " + wynik);
    }

    private static int pobierzWielkoscListy() {
        System.out.println("Podaj jaka chcesz miec wielkosc tablicy");
        int wielkosc = sc.nextInt();
        return wielkosc;
    }

    private static void dodajRandomoweLiczbyDoListy(List<Integer> integerList, int wielkosc) {
        for (int i = 0; i < wielkosc; i++) {
            integerList.add(i, r.nextInt(20));
        }
    }


}
