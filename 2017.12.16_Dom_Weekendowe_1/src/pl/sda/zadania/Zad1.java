//Zad1
//kalkulator z modulo
package pl.sda.zadania;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wynik = 0;
        System.out.println("Podaj dwie liczby: ");
        int liczba1 = scanner.nextInt();
        int liczba2 = scanner.nextInt();
        System.out.println("MENU: Co chcesz robic wpisz znak. ");
        System.out.println("1. Dodawac + ");
        System.out.println("2. Odejmowac - ");
        System.out.println("3. Mnozenie * ");
        System.out.println("4. Dzielenie  /");
        System.out.println("5. Modulo %");
        scanner.nextLine();
        String znak = scanner.nextLine();

        System.out.print("Wynik: ");
        System.out.print(liczba1+znak+liczba2+"=");

        switch (znak) {
            case "+":
                kalDodawanie(liczba1, liczba2);
                break;
            case "-":
                kalOdejmowanie(liczba1, liczba2);
                break;
            case "*":
                kalMnozenie(liczba1, liczba2);
                break;
            case "/":
                kalDzielenie(liczba1, liczba2);
                break;
            case "%":
                kalModulo(liczba1, liczba2);
                break;
            default: break;

        }
    }

    private static void kalModulo(int liczba1, int liczba2) {
        System.out.println(liczba1%liczba2);
        System.out.println("Pierwsza liczba modulo= " + Math.abs(liczba1));
        System.out.println("Druga liczba modulo= " + Math.abs(liczba2));

    }

    private static void kalDzielenie(int liczba1, int liczba2) {
        System.out.println(liczba1/liczba2);
    }

    private static void kalMnozenie(int liczba1, int liczba2) {
        System.out.println(liczba1*liczba2);
    }

    private static void kalOdejmowanie(int liczba1, int liczba2) {
        System.out.println(liczba1-liczba2);
    }

    private static void kalDodawanie(int liczba1, int liczba2) {
        System.out.println(liczba1+liczba2);
    }
}
//1
