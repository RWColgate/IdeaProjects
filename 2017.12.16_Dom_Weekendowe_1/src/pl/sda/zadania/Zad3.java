//Zadanie3
//losowanie od -100 do 5
package pl.sda.zadania;

import java.util.Random;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj zakres:");

        System.out.print("Od: ");
        int poczatek = scanner.nextInt();
        System.out.print("\nDo: ");
        int koniec = scanner.nextInt();

        int losowa = r.nextInt(koniec-poczatek+1)+poczatek;

        System.out.println(losowa);

    }
}
//1
