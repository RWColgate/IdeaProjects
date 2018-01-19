package pl.sda.petle.petlawhile;

import java.util.Scanner;

public class PetlaWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int liczba = scanner.nextInt();
        int i=0;
        System.out.println("Licze do: " + liczba);
        while(i<liczba){
            i++;
            System.out.println(i);
        }
        System.out.println("Licze do zera");
        while(i>0){
            System.out.println(i);
            i--;
        }


//        while(true){
//            System.out.println("Error!");
//        }
    }
}
