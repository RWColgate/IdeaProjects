package pl.sda.petle.petlepowtorka;

import java.util.Scanner;

public class petlepowtorka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wypisuje liczby od 1-100");
        for (int i=0; i<=100; i++){
            System.out.println(i);
        }

        System.out.println("Podaj jaka liczbe chcesz: ");

        int zmienna = scanner.nextInt();
        for (int j=zmienna; j<100; j++){
            System.out.println(j);
        }

        System.out.println("Podaj dwie liczby jakie bede sumowac");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x+y);

        int pom2=0;
        while(scanner.hasNextInt()){
            int pom = scanner.nextInt();
            if(pom==0) break;
            else System.out.println(pom2+=pom);
        }
    }
}
