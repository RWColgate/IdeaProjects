package pl.sda.obiektowosc.zgadnijhaslo;

import java.util.Scanner;

public class Gra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZgadnijHaslo zgadnij = new ZgadnijHaslo(10, 50, 90);
        zgadnij.generujLiczbe();
        int odpowiedz, life=5;

        System.out.println("Zgadnij numer: ");


        do {
            life--;
            System.out.println("Zostalo ci " + (life+1)+ " zyc.");
            odpowiedz = scanner.nextInt();
            zgadnij.sprawdzCzyWygrales(odpowiedz);
            if(life==0) System.out.println("Niestety straciles wszystkie proby, liczba to bylo: " + zgadnij.getNumer());
        } while ((odpowiedz != zgadnij.getNumer()) && (life != 0) && scanner.hasNextInt());
    }

}
