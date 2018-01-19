package pl.sda.OjciecTest;

import java.util.Scanner;

public class test {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double licznik;
        double mianownik;
        double wynik;
        while(true){

        System.out.println("Podaj licznik: ");
        licznik = scanner.nextDouble();
        System.out.println("Podaj mianownik: ");
        mianownik = scanner.nextDouble();

        wynik = licznik/mianownik;

        System.out.println(wynik);

        }
    }
}
