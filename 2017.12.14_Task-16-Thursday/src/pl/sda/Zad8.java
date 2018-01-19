//Zadanie8
package pl.sda;

import com.sun.nio.sctp.PeerAddressChangeNotification;

import java.util.Random;
import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Ile chcesz miec liczb w tablicy: ");
        int ile_w_tablicy = scanner.nextInt();

        // tworzenie tablicy na dana liczbe oraz uzupelnianie
        int[] tab = new int[ile_w_tablicy];
        //System.out.print("Podaj 1 element: ");
        for(int i=0; i<tab.length; i++){
            tab[i] = r.nextInt(50);
        }

        System.out.println("Sortowanie malejace: ");
        //sortowanie malejace
        int pom=0;
        for(int i=0; i<tab.length; i++){
            for (int j=0; j<tab.length; j++){
                if(tab[i]>tab[j]){
                    pom = tab[i];
                    tab[i]=tab[j];
                    tab[j]=pom;
                }
            }
        }

        //wyswietlanie tablicy
        for(int i=0; i<tab.length; i++){
            System.out.print(tab[i]+ " ");
        }

        System.out.println("\nSortowanie rosnace: ");
        //sortowanie rosnace
        int pom2=0;
        for(int i=0; i<tab.length; i++){
            for (int j=0; j<tab.length; j++){
                if(tab[i]<tab[j]){
                    pom2 = tab[i];
                    tab[i]=tab[j];
                    tab[j]=pom2;
                }
            }
        }
        //wyswietlanie tablicy
        for(int i=0; i<tab.length; i++){
            System.out.print(tab[i]+" ");
        }
    }
}
