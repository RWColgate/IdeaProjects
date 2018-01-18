package pl.sda;

import java.util.Scanner;

public class Test4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dzielniki rozdziolne spacja by zakonczyc wprowadzanie wpisz # i wcisnij enter");
        int[] tablicaDzilnikow = new int[100];
        int i = 0;
        while (scanner.hasNextInt()) {
            tablicaDzilnikow[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Podaj liczbe");
        scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

        int[] tablicaLiczbMniejszych = zwrocLiczbyMniejsze(liczba);
        for (int s = 0; s < tablicaLiczbMniejszych.length; s++) {
            if (jestPodzielnePrzezDzielniki(tablicaLiczbMniejszych[s], tablicaDzilnikow)) {
                System.out.println(tablicaLiczbMniejszych[s]);
            }
        }
    }

    private static int[] zwrocLiczbyMniejsze(int liczba) {
        int[] tablica = new int[liczba];
        for (int k = 0; k < liczba; k++) {
            tablica[k] = k;
        }
        return tablica;
    }

    private static boolean jestPodzielnePrzezDzielniki(int liczba, int[] dzielniki) {
        for (int j = 0; j < dzielniki.length; j++) {
            if (dzielniki[j] == 0) {
                continue;
            }
            if (liczba % dzielniki[j] == 0) {
                return true;
            }
        }
        return false;
    }
}