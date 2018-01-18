//package pl.sda.obiektowosc.KontoBankowe;
//
//import java.util.Scanner;
//
//public class WypisywanieKont {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        KontoBankowe kontoAndrzeja = new KontoBankowe(123L,1000);
//        KontoBankowe kontoBeaty = new KontoBankowe(555l, 2000);
//
//
//        String odpowiedz = "nie";
//        KontoBankowe[] konta = new KontoBankowe[MAX_LICZBA_KONT];
//        int licznikKont=0;
//
//        do{
//            konta[licznikKont] = utworzKontoBankowe();
//            licznikKont++;
//            System.out.println("Czy chcesz utworzy nowe konto?");
//            odpowiedz = scanner.nextLine();
//        }while (odpowiedz.equalsIgnoreCase("tak") || licznikKont == MAX_LICZBA_KONT);
//        // ctrl+alt +c+c ustala zmienna stala
//
//        System.out.println("Czy chcesz dokonac przelewu? ");
//        String czyPrzelacPieniadze = "nie";
//        do{
//            System.out.println("Podaj numer konta od kogo pobierasz: ");
//            long odKogo = scanner.nextLong();
//            System.out.println("Podaj ile srodkow: ");
//            int ileSrodkow = scanner.nextInt();
//            System.out.println("Podaj numer konto do kogo wysylasz: ");
//            long doKogo = scanner.nextLong();
//            KontoBankowe nadawca = pobierzKontoZRejestru(konta, odKogo);
//            int pobrane = nadawca.pobierzSrodki(2000);
//
//            //KontoBankowe kontoCwaniaczka = new KontoBankowe(99L, 0);
//            //kontoCwaniaczka.stankonta = 1000000);
//
//
//        }while(czyPrzelacPieniadze.equalsIgnoreCase("tak"));
//
//    }
//}
