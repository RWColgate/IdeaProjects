//Zadanie6
package pl.sda;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tekst = podajWyraz();
        String[] tab = tekst.split("");
        wypiszTekstOdTylu(tab);


        //Dodatkowe zadanko

        String string = "Software Development Academy";
        System.out.println("\n"+string+"\n");
        odwracanieSlow(string);
        System.out.println();
        odwracanieLiter(string);

    }

    private static void odwracanieLiter(String string) {
        System.out.println("Po odwroceniu liter");
        String[] litery = string.split("");
        for (int i = litery.length - 1; i >= 0; i--) {
            System.out.print(litery[i] + " ");
        }
        System.out.println();
    }

    private static void odwracanieSlow(String string) {
        System.out.println("Po odwroceniu slow");
        String[] slowa = string.split(" ");
        for (int i = slowa.length - 1; i >= 0; i--) {
            System.out.print(slowa[i] + " ");
        }
        System.out.println();
    }

    private static void wypiszTekstOdTylu(String[] tab) {
        System.out.println("Tekst od tylu: ");
        for(int i=tab.length-1; i>=0; i--){
            System.out.print(tab[i]);
        }
        System.out.println();

    }

    private static String podajWyraz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        String tekst = scanner.nextLine();
        return tekst;
    }

}

//1