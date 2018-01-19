//Zadanie4
package pl.sda;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ileWTablicy = pobieranieWielkosciTablicy();
        int[] dzielniki = new int[ileWTablicy];
        pobieranieDzielnikow(dzielniki);
        int calkowita = pobieranieLiczbyOdUzytkownika();
        //sprawdzanieCzyLiczbaJestDzielnikiemObydwu(dzielniki, calkowita);
        sprawdzanieCzyLiczbaJestDzielnikiemChocJednego(dzielniki, calkowita);

    }

    private static void sprawdzanieCzyLiczbaJestDzielnikiemChocJednego(int[] dzielniki, int calkowita) {
        for (int i = 1; i < calkowita; i++) {
            for (int j = 0; j < dzielniki.length; j++) {
                if (i % dzielniki[j] == 0){
                    System.out.print(i + " ");
                }
            }
        }
    }


    private static void sprawdzanieCzyLiczbaJestDzielnikiemObydwu(int[] dzielniki, int calkowita) {
        boolean czy_dzielnik = false;
        for (int i = 1; i < calkowita; i++) {
            for (int j = 0; j < dzielniki.length; j++) {
                if (i % dzielniki[j] == 0) {
                    czy_dzielnik = false;
                } else {
                    czy_dzielnik = true;
                    break;
                }
            }
            if (czy_dzielnik == false) System.out.print(i + " ");
        }
    }

    private static int pobieranieLiczbyOdUzytkownika() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita: ");
        int calkowita = scanner.nextInt();
        return calkowita;
    }

    private static void pobieranieDzielnikow(int[] dzielniki) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dzielniki: ");
        for (int i = 0; i < dzielniki.length; i++) {
            dzielniki[i] = scanner.nextInt();
        }
    }

    private static int pobieranieWielkosciTablicy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile chcesz dzielnikow wpisac do tablicy?");
        int ileWTablicy = scanner.nextInt();
        return ileWTablicy;
    }
}
//1