package pl.sda.helloworld;

import java.util.Scanner;

public class DodawanieParametrami {
    public static void main(String[] args) {
        int[] tab = zamienNaLiczby(args);
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            suma += tab[i];
        }
        System.out.println("Suma wprowadzonych liczb to: " + suma);
    }

    private static int[] zamienNaLiczby(String[] znaki) {
        int[] liczby = new int[znaki.length];
        for (int i = 0; i < znaki.length; i++) {
            liczby[i] = Integer.parseInt(znaki[i]);
        }
        return liczby;
    }
}
