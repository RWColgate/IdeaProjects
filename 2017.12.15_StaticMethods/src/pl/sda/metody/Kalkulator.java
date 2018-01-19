//Kalkulator
package pl.sda.metody;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wynik=0;
        System.out.println("Podaj dwie liczby: ");
        int liczba1 = scanner.nextInt();
        int liczba2 = scanner.nextInt();
        System.out.println("MENU: Co chcesz robic wpisz znak. ");
        System.out.println("1. Dodawac + ");
        System.out.println("2. Odejmowac - ");
        System.out.println("3. Mnozenie * ");
        System.out.print("4. Dzielenie  /");
        scanner.nextLine();
        String znak = scanner.nextLine();


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
        }
    }

    private static void kalDodawanie(int liczba1, int liczba2) {
        System.out.println(liczba1+liczba2);
    }

    private static void kalOdejmowanie(int liczba1, int liczba2) {
        System.out.println(liczba1-liczba2);
    }

    private static void kalMnozenie(int liczba1, int liczba2) {
        System.out.println(liczba1*liczba2);
    }

    private static void kalDzielenie(int liczba1, int liczba2) {
        System.out.println(liczba1/liczba2);
    }
}
//1