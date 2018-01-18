//Zadanie17
package pl.sda;

import java.util.Scanner;

public class Zad17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] wynik_tab = new int[11];


            System.out.println("Podaj pesel: ");
            String PESEL = scanner.nextLine();
            String[] tab = PESEL.split("");


        wynik_tab[1] = Integer.valueOf(tab[1])*3;
        wynik_tab[2] = Integer.valueOf(tab[2])*7;
        wynik_tab[3] = Integer.valueOf(tab[3])*9;
        wynik_tab[5] = Integer.valueOf(tab[5])*3;
        wynik_tab[6] = Integer.valueOf(tab[6])*7;
        wynik_tab[7] = Integer.valueOf(tab[7])*9;
        wynik_tab[9] = Integer.valueOf(tab[9])*3;

        System.out.println("Tabela wymnorzona: ");
        for(int j=0; j<11; j++){
            System.out.print(wynik_tab[j]+" ");
        }
        System.out.println();

        int wynik=0;
        for(int i=0; i<11; i++){
            wynik+=Integer.valueOf(wynik_tab[i]);
        }

        System.out.println("Suma: "+wynik);
        if(wynik%10==0) System.out.println("D");
        else System.out.println("N");
    }
}
//1