//Zadanie5
//wisielec
package pl.sda.zadania;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zad5 {
    static int life = 5;
    static String[] tabZgadl = new String[]{"x", "x", "x", "x", "x"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        String czyPowtorzyc = null;
        do {
            life = 5;
            do {
                int[] tabInt = new int[5];
                char[] tabChar = new char[5];
                String[] tabString = new String[5];

                generowanieHasla(tabChar, tabInt, tabString);
                sprawdzanieCzyZgadl(tabChar, tabInt, tabString);
                czyZgadlHaslo(tabZgadl);

            } while (life > 0);

            System.out.println("Czy chcesz powtorzyc gre?");
            czyPowtorzyc = scanner.nextLine();

        } while (czyPowtorzyc.equals("t"));
    }

    private static void czyZgadlHaslo(String[] tabZgadl) {
        boolean czyPusta = true;
        for (int i = 0; i < tabZgadl.length; i++) {
            if (!tabZgadl[i].equals("x")) czyPusta = true;
            else {
                czyPusta = false;
                break;
            }
        }
        if (czyPusta = true) System.out.println("Bravo zgadles haslo");
    }

    private static void wyswietlTablice(String[] tabString) {
        for (int i = 0; i < tabString.length; i++) {
            System.out.print(tabString[i]);
        }
        System.out.println();
    }

    private static void sprawdzanieCzyZgadl(char[] tabChar, int[] tabInt, String[] tabString) {

        for (int i = 0; i < tabZgadl.length; i++) {
            if (!tabZgadl[i].equals("x")) break;
        }
        System.out.println("Zgadnij haslo, podaj 1 litere: ");
        Scanner scanner = new Scanner(System.in);
        String proba = null;

        boolean czyOdejmujemy = false;
        for (int i = 0; i < tabString.length; i++) {
            czyOdejmujemy = false;
            proba = scanner.nextLine();
            if (proba.length() != 1) {
                life = 0;
                break;
            }
            for (int j = 0; j < tabString.length; j++) {
                if (tabString[j].equals(proba)) {
                    czyOdejmujemy = true;
                    System.out.println("Bravo zgadles litere: ");
                    for (int k = 0; k < tabString.length; k++) {
                        if (k == j) tabZgadl[j] = tabString[j];
                    }
                    wyswietlTablice(tabZgadl);
                }

            }
            if (czyOdejmujemy = false) {
                life--;
                System.out.println("Niestety nie zgadles litery, zostalo ci: " + life + " zyc.");
            }
            System.out.println();
        }
    }

    private static void generowanieHasla(char[] tabChar, int[] tabInt, String[] tabString) {
        Random r = new Random();
        String haslo = null;
        for (int i = 0; i < 5; i++) {
            tabInt[i] = r.nextInt(122 - 97) + 97;
            tabChar[i] = (char) tabInt[i];
            System.out.print(tabChar[i]);
            tabString[i] = Character.toString(tabChar[i]);
        }
        System.out.println();
    }
}

