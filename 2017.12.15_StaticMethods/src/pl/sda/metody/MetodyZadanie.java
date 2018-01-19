package pl.sda.metody;

import java.util.Scanner;

public class MetodyZadanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba = 0;
        do {
            System.out.println("Podaj liczbe: ");
            liczba = scanner.nextInt();
            drukujParzystoscLiczby(liczba);
        }while(liczba!=0);
    }

    private static boolean czyLiczbaJestParzysta(int liczba) {
        return liczba%2==0;
    }

    private static void drukujParzystoscLiczby(int liczba) {
        if(czyLiczbaJestParzysta(liczba)){
            System.out.println("Liczba parzysta");
        }else{
            System.out.println("Liczba nieparzysta");
        }
    }
}
