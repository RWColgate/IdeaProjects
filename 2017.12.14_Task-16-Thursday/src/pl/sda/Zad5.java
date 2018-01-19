//Zadanie5
package pl.sda;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        podajLiczbe();
        dzielenieNaDziesiec();

        podajLiczbe();
        splitStringNextLine();

    }

    private static void podajLiczbe() {
        System.out.print("Podaj liczbe: ");

    }

    private static void dzielenieNaDziesiec() {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int wynik=0;
        while(liczba>10){
            wynik+=liczba%10;
            liczba/=10;
        }
        System.out.println("Wynik dodawania jednosci: "+ (wynik+liczba));
    }

    private static void splitStringNextLine() {
        Scanner scanner = new Scanner(System.in);
        int wynik=0;
        String liczba = scanner.nextLine();
        String[] tab = liczba.split("");
        for(int i=0; i<tab.length; i++){
            wynik += Integer.valueOf(tab[i]);
        }
        System.out.println("Wynik dodawania jednosci = " + wynik);
    }
}
//1