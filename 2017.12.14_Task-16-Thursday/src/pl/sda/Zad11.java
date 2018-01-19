//Zadanie11
package pl.sda;

import java.util.Random;

public class Zad11 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] tab_1 = new int [10];
        int[] tab_2 = new int [10];
        int[] tab_3 = new int [20];

        for (int i=0; i<10; i++){
            tab_1[i] = r.nextInt(50);
            tab_2[i] = r.nextInt(50);
        }


        System.out.println("Tabela 1: ");
        for (int i=0; i<10; i++){
            System.out.print(tab_1[i]+ " " );
        }
        System.out.println("\nTabela 2: ");
        for (int i=0; i<10; i++){
            System.out.print(tab_2[i]+ " " );
        }



        int tab3_liczenie=0;
        for(int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                if(tab_2[j]==tab_1[i]){
                    tab_3[tab3_liczenie] = tab_1[i];
                    tab3_liczenie++;
                }
            }
        }
        System.out.println("\nTabela 3: ");
        for (int i=0; i<tab3_liczenie; i++){
            System.out.print(tab_3[i]+ " " );
        }
    }
}
//1 ale nie eliinuje powtorzen