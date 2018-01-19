//package pl.sda.metody;
//
//import java.util.Scanner;
//
//public class MetodyZadania2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int liczba = 0, ileLiczb=0;
//
//
//            //pytam sie ile liczb w tablicy
//            System.out.println("\nPrzez ile liczba chcesz dzielic? ");
//            ileLiczb = scanner.nextInt();
//
//            //tworze tablice
//            int[] tab = new int[ileLiczb];
//
//            //wpisuje do tablicy
//            for(int i=0; i<tab.length; i++){
//                System.out.println("Podaj " + i + " liczbe");
//                tab[i] = scanner.nextInt();
//            }
//            //pytam przez jaka liczbe maja sie dzielic z tablicy
//            System.out.println("Jaka liczbe chcesz sprawdzic podzielnosc");
//            liczba = scanner.nextInt();
//
//            czyDzielna(liczba,tab);
//            czyDziela(liczba,tab);
//
//    }
//
//    private static boolean czyDziela(int liczba, int[] tab) {
//        boolean czyPodzielna = false;
//        for (int i = 0; i < tab.length; i++) {
//            if (tab[i]%liczba == 0) {
//                czyPodzielna = true;
//            } else {
//                czyPodzielna = false;
//                break;
//            }
//
//        }
//    }
//
//    private static void czyDzielna(int liczba, int tab[]) {
//        boolean x = czyDziela(liczba, tab);
//        if(czyPodzielna=true) {
//            System.out.print("Liczba podzielna przez ");
//            int x = tab.length;
//            if (czyPodzielna = true) {
//                for (int i = 0; i < tab.length; i++) {
//
//                    System.out.print(tab[i] + ", ");
//                }
//                //System.out.println("i " + tab[x]);
//            }
//        }
//        else{
//        System.out.println("Liczba nie podzielna ");
//        }
//
//    }
//}
