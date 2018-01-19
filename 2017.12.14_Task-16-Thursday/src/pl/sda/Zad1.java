package pl.sda;


import java.util.Random;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        int[] ja = new int[6];
        int[] komp = new int[6];

        System.out.println("Podaj 6 liczb: \n");
        //wpisywanie 6 roznych liczb z reki

        int podaneLiczby = 0;
        int temp;
        do {
            System.out.println("Podaj liczbe #" + podaneLiczby);
            temp = scanner.nextInt();
            boolean unikat = true;
            for (int i = 0; i < ja.length; i++) {
                if (ja[i] == temp)unikat = false;
                //if jak tylko 1linie piszemy to mozna bez {}
            }
            if (unikat) {
                ja[podaneLiczby] = temp;
                podaneLiczby++;
            }
        } while (podaneLiczby < 6);


        //komp generuje 6 liczb
        int generowane_liczby=0;
        int gen;
        do{
            System.out.println("System generuje #" + generowane_liczby);
            gen = r.nextInt(50);
            boolean special = true;
            for (int i = 0; i < komp.length; i++) {
                if(komp[i] == gen)special = false;
                }
                if(special){
                komp[generowane_liczby] = gen;
                    generowane_liczby++;
                }
        }while(generowane_liczby<6);


        //wypisywanie mojej tablicy
        for (int i = 0; i < ja.length; i++) {
            System.out.print(ja[i] + " ");
        }

        //wypisywanie tablicy kompa
        System.out.println();
        for (int i = 0; i < komp.length; i++) {
            System.out.print(komp[i] + " ");
        }

        //ile trafien
        System.out.print("\nTrafiono: ");
        int ile_trafien = 0;
        for (int i = 0; i < komp.length; i++) {
            for (int j = 0; j < ja.length; j++) {
                if (ja[j] == komp[i]) ile_trafien++;
            }
        }
        System.out.print(ile_trafien);

    }
}
//1
