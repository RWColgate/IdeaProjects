//Zadanie10
package pl.sda;

import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zacznij podawac liczby po spacji i zakoncz enterem");
        String tekst = scanner.nextLine();
        String[] tab = tekst.split(" ");

        int wielkosc = zwracaWartoscDrugiejTablicy(tab);
        String[] bez_duplikatow = new String[wielkosc];
        wpisywanieDanychDoNowejTablicy(tab,bez_duplikatow);

    }

    private static void wpisywanieDanychDoNowejTablicy(String[] tab, String[] bez_duplikatow) {
        boolean rozne = false;
        bez_duplikatow[0] = tab[0];
        int iterator = 0;
        for (int i=1; i<tab.length; i++){
            for(int j=1; j<bez_duplikatow.length; j++){
                if(tab[i].equals(bez_duplikatow[j]))rozne = true;
            }
            if(!rozne){
                tab[iterator] = bez_duplikatow[i];
                iterator++;
            }
            else{
                rozne = false;
            }
        }
        wyswietlTablica(bez_duplikatow);

    }

    private static int zwracaWartoscDrugiejTablicy(String[] tab) {
        int ile_duplikatow=0;
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab.length; j++){
                if(tab[j].equals(tab[i])){
                    ile_duplikatow++;
                }
            }
        }
        ile_duplikatow=ile_duplikatow-tab.length;
        wyswietlTablica(tab);
        int wielkosc = tab.length - ile_duplikatow/2;
        return wielkosc;
    }

    private static void wyswietlTablica(String[] tab) {
        for(int i=0; i<tab.length; i++){
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
}
//0