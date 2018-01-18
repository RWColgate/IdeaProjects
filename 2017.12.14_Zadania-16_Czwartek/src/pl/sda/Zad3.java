//Zadanie3
package pl.sda;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba =pobieranieLiczbyOdUzytkownika();
        int[] tab = new int[liczba];

        zbiorLiczbMniejszych2(tab,liczba);
        zbiorLiczbMniejszych3(tab,liczba);
        zbiorLiczbMniejszychZadanychZReki(tab,liczba);


    }

    private static void zbiorLiczbMniejszychZadanychZReki(int[] tab, int liczba) {
        Scanner scanner = new Scanner(System.in);
        int miejsceTabb=0;
        System.out.println("Podaj liczbe przez jaka chcesz dzielic tablice: ");
        int dzielenie = scanner.nextInt();
        System.out.println("Liczby z dzielenie "+dzielenie);
        for(int i=0; i<liczba;i++){
            tab[miejsceTabb]=i;
            if(i%dzielenie==0) System.out.print(tab[miejsceTabb]+" ");
            miejsceTabb++;
        }
        System.out.println();

    }

    private static void zbiorLiczbMniejszych3(int[] tab, int liczba) {
        System.out.println("Liczby z dzielenie %3 ");
        int miejsceTab=0;
        for(int i=0; i<liczba; i++){
            tab[miejsceTab]=i;
            if(i%3==0) System.out.print(tab[miejsceTab]+ " ");
            miejsceTab++;
        }
        System.out.println();
    }


    private static void zbiorLiczbMniejszych2(int[] tab, int liczba) {
        System.out.println("Liczby z dzielenie %2 ");
        int miejsceTablicy=0;
        for(int i=0; i<liczba; i++){
            if(i%2==0){
                tab[miejsceTablicy]=i;
                System.out.print(tab[miejsceTablicy]+ " ");
                miejsceTablicy++;
            }
        }
        System.out.println();
    }


    private static int pobieranieLiczbyOdUzytkownika() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj jaki max element: ");
        int liczba = scanner.nextInt();
        return liczba;
    }
}
//1