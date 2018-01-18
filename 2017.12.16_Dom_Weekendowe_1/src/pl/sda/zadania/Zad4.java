//Zadanie4
//Wpisywanie tablicy i wypisywanie min/max/avg/ile + powtorzanie
package pl.sda.zadania;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String czyPowtorzyc;
        do {
            System.out.println("Ile elementow w tablicy ?");

            int dlugoscTablicy = scanner.nextInt();
            int[] tablica = new int[dlugoscTablicy];

            pobieramyWartosciTablicy(tablica);
            drukujOpisTablicy(tablica);
            System.out.println("\nCzy chcialbys powtorzyc program? tak/nie");
            scanner.nextLine();

            do {
                czyPowtorzyc = scanner.nextLine();
                if (!czyPowtorzyc.equals("tak") && !czyPowtorzyc.equals("nie")) {
                    System.out.println("Podano nieprawidlowa odpowiedz");
                }
            } while (!czyPowtorzyc.equals("tak") && !czyPowtorzyc.equals("nie"));

        } while (czyPowtorzyc.equals("tak"));

    }

    private static void pobieramyWartosciTablicy(int[] tablica) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Podaj " + (i + 1) + " element tablicy");
            tablica[i] = scanner.nextInt();
        }
    }


    private static void drukowanieTablicy(int[] tablica) {
        System.out.print("Tablica: ");
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
    }

    private static void drukujOpisTablicy(int[] tablica) {
        drukowanieTablicy(tablica);
        System.out.println();
        int pom;
        double suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
                if (tablica[i] < tablica[j]) {
                    pom = tablica[i];
                    tablica[i] = tablica[j];
                    tablica[j] = pom;
                }
            }
        }
        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i];
        }
        System.out.println("Min wartosc: " + tablica[0]);
        System.out.println("Max wartosc: " + tablica[tablica.length - 1]);
        System.out.println("Srednia wartosc tablicy: " + suma / tablica.length);
        System.out.println("Ilosc elementow: " + tablica.length);

    }
}
