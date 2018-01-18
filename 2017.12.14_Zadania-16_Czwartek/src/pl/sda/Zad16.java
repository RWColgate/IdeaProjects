//Zadanie16
package pl.sda;

import java.util.Random;
import java.util.Scanner;

public class Zad16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        String[][] tab = new String[3][3];
        System.out.println("Czym chcesz grac? o - kolko czy x-krzyzyk");
        String znak = scanner.nextLine();
        System.out.println("Napisz gdzie chcesz wkleic swoj znak");
        int miejsceWpisu = scanner.nextInt();

        int systemRandom=0;
        while(systemRandom!=miejsceWpisu) systemRandom= r.nextInt(8);
        for(int i=0; i<9; i++){
            if (miejsceWpisu==i){
                System.out.println(znak);
            }
            if(systemRandom==i){
                if(znak.equals("x")) System.out.println("o");
                else System.out.println("x");
            }
            else System.out.print(i);
            if(i==2 || i==5 || i==8) System.out.println();

        }
    }
}
