package pl.sda.petle.petlafor;

import java.util.Scanner;

public class PetlaZadanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
        System.out.println("Podaj liczbe: ");
        int liczba = scanner.nextInt();
        System.out.println("Podaj dzielnik: ");
        int dzielnik = scanner.nextInt();

        for(int i=1; i<liczba; i++){
            if(i%dzielnik==0) System.out.println(i);
        }
*/

        System.out.println("Podaj n: ");
        int n = scanner.nextInt();
        System.out.println("Podaj m: ");
        int m = scanner.nextInt();
        int w=1;
        for (int i=1; i<=m; i++){
            w*=n;
        }
        System.out.println(w);
    }
}
