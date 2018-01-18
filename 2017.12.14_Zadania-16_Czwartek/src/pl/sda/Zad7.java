//Zadanie7
package pl.sda;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tekst = podajTekst();
        String[] tab = tekst.split("");

        System.out.println("Podany tekst: " + tekst + " zawiera: ");
        ileLiczb(tekst, tab);

    }

    private static void ileLiczb(String tekst, String[] tab) {
        int liczb = 0, innych_znakow = 0, liter = 0, spacji = 0;

        for(int i=0; i<tekst.length(); i++){
            char znak = tekst.charAt(i);
            if(Character.isDigit(znak)){
                liczb++;
            }
            else if(Character.isLetter(znak)){
                liter++;
            }
            else if(!Character.isLetterOrDigit(znak)){
                innych_znakow++;
            }
        }
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].equals(" ")) spacji++;
        }
        System.out.println("Liczb: " + liczb);
        System.out.println("Liter: " + liter);
        System.out.println("Innych znakow: " + (innych_znakow-spacji));
        System.out.println("Spacji: "+ spacji);
    }

    private static String podajTekst() {
        Scanner scanner = new Scanner(System.in);
        String tekst = scanner.nextLine();
        return tekst;
    }
}
//1