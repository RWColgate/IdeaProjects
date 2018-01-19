//Zadanie14
package pl.sda;

import java.util.Random;
import java.util.Scanner;

public class Zad14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        boolean koniec = true;
        double ile_nalales=0, ile_placisz=0;
        do{

            System.out.println("Czy chcesz kontynuowac napelnianie baku? ");
            String czy_chcesz = scanner.nextLine();
            switch(czy_chcesz) {
                case "t":
                    ile_nalales+=r.nextInt(40);
                    ile_placisz=ile_nalales*3.5;
                    break;
                case "n": koniec=false;
                    break;
            }
            System.out.println("Nalales :" + ile_nalales + " litrow paliwa");
            System.out.println("Musisz zaplacic: " + ile_placisz+ " zl");

        }while(koniec==true);

    }
}
//1