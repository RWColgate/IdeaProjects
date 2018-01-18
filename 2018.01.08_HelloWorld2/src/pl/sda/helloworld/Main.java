package pl.sda.helloworld;

import org.omg.CORBA.TRANSACTION_MODE;
import pl.sda.helloworld.Kalkulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        String dzialanie = args[0];
        args[0] = "0";
        int[] liczby;
//        try {
            liczby = zamienNaLiczby(args);
//        }catch (NumberFormatException e){
//            liczby = new int[0];
//            System.out.println("Wprowadzono bledna liczbe");
//        }
        int wynik = 0;

        switch (dzialanie) {
            case "+":
                System.out.println("Wynik to " + kalkulator.dodaj(liczby));
                break;
            case "-":
                System.out.println("Wynik to " + kalkulator.odejmij(liczby));
                break;
            default:
                System.out.println("nie wprowadzono znaku");
        }

    }

    private static int[] zamienNaLiczby(String[] znaki) {
        int[] liczby = new int[znaki.length];
        for (int i = 0; i < znaki.length; i++) {
            try {
            liczby[i] = Integer.parseInt(znaki[i]);
            }catch (NumberFormatException e){
                System.out.println(znaki[i] + " nie jest liczba i zostanie zignoirowany");
            }
        }
        return liczby;
    }
}
