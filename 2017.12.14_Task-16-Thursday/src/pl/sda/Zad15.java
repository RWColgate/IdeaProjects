//Zadanie15
package pl.sda;

import java.util.Scanner;

public class Zad15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dwie liczby");
        int pierwsza = scanner.nextInt();
        int druga = scanner.nextInt();

        int pom;
        if (pierwsza>druga)pom=pierwsza;
        else pom=druga;

        for (int i=pom; i>0; i--){
            if(pierwsza%i==0 && druga%i==0){
                System.out.println("Najwiekszy wspolny dzielnik : " + i);
                break;
            }
        }
    }
}
//1