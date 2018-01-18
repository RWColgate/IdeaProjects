//Zadanie8
package pl.sda.zadania;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst");
        String slowo = scanner.nextLine();
        String[] tab = slowo.split(" ");

        System.out.println("Ilosc uzytych slow: " + tab.length);
        sredniaDlugoscSlow(tab);
        najczestszeSlowo(tab);
        najrzadszeSlowo(tab);
    }

    private static void najrzadszeSlowo(String[] tab) {
        int ileRazyTo;
        int[] tab2 = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            ileRazyTo=0;
            for (int j = 0; j < tab.length; j++) {
                if (tab[i].equals(tab[j])){
                    ileRazyTo++;
                }
                tab2[i]=ileRazyTo;
            }
        }
        int pom2;
        String pom;
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab.length; j++){

                if(tab2[i]<tab2[j]){
                   pom = tab[i];
                   tab[i]=tab[j];
                   tab[j]=pom;

                   pom2=tab2[i];
                   tab2[i]=tab2[j];
                   tab2[j]=pom2;
               }
            }
        }
        System.out.println("Najrzadsze slowo: " +tab[0]);
    }


    private static void najczestszeSlowo(String[] tab) {
        int ileRazyTo;
        int ileRazyNajczestsze = 0;
        String najczestsze = null;


        for (int i = 0; i < tab.length; i++) {
            ileRazyTo=0;
            for (int j = 0; j < tab.length; j++) {

                if (tab[i].equals(tab[j])){
                    ileRazyTo++;
                }
                if (ileRazyTo > ileRazyNajczestsze) {
                    najczestsze = tab[j];
                    ileRazyNajczestsze = ileRazyTo;
                }
            }
        }
        System.out.println("Najczestsze slowo: " + najczestsze);
    }

    private static void sredniaDlugoscSlow(String[] tab) {
        int suma = 0;
        double srednia;
        for (int i = 0; i < tab.length; i++) {
            suma += tab[i].length();
        }
        srednia = suma / tab.length;
        System.out.println("Srednia dlugosc wyrazu to: " + srednia);
    }
}

