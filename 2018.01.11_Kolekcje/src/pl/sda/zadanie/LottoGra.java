package pl.sda.zadanie;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LottoGra {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public int zwrocWynik(Set<Integer> uzytkownikZbior, Set<Integer> komputerLosowanie){
        int wynik=0;
        for (Integer liczba:uzytkownikZbior){
            if (komputerLosowanie.contains(liczba)){
                wynik++;
            }
        }
        return wynik;
    }
    public void zagraj() {
        Set<Integer> lista = new LinkedHashSet<>();
        int liczba;
        do {
            System.out.println("Podaj liczbe 1-49");
            liczba = scanner.nextInt();
            if (liczba>=1 && liczba<=49){
                lista.add(liczba);
            }
        } while (lista.size() < 6);
    }

    private Set<Integer> przeprowadzLosowanie(){
        Set<Integer> wylosowaneLiczby = new LinkedHashSet<>();
        while(wylosowaneLiczby.size()<6){
            wylosowaneLiczby.add(random.nextInt(48)+1);
        }
        return wylosowaneLiczby;
    }
}
