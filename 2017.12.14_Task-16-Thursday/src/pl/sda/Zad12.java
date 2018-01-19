//Zadanie12
package pl.sda;

import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //pobieranie zmiennej ile liczb
        int liczba = 0;
        do {
            System.out.println("Podaj liczbe od 1 do 20");
            liczba = scanner.nextInt();
        }while(liczba<0 || liczba>20);

        //wypisywanie
        for(int i=1; i<=liczba; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
//1
