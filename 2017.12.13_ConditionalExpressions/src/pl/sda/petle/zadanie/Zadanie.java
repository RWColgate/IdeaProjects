package pl.sda.petle.zadanie;

import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int i=0, suma=0;
        while(i<liczba){
            i++;
            suma+=i;
        }
        System.out.println(suma);

        System.out.println("Podaj do jaka liczba: ");
        int n = scanner.nextInt();
        System.out.println("Podaj do jakiej potegi: ");
        int m = scanner.nextInt();
        int j=0;
        int wynik=1;
        while(j<m){
            wynik*=n;
            j++;
        }
        System.out.println(wynik);
    }
}
