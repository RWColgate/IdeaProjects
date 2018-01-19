//package pl.sda.obiektowosc.KontoBankowe;
//
//import java.util.Scanner;
//
//public class KontoBankowe {
//    public static final int MAX_LICZBA_KONT = 9;
//    long numerKonta;
//    int stanKonta;
//
//    public KontoBankowe(long numerKonta, int stanKonta) {
//        this.numerKonta = numerKonta;
//        this.stanKonta = stanKonta;
//    }
//
//    private static KontoBankowe pobierzKontoZRejestru(KontoBankowe[] konta, long numer) {
//        for (KontoBankowe kontoBankowe:konta){
//            if(kontoBankowe.numerKonta==numer){
//                return kontoBankowe;
//            }
//
//        }
//    }
//
//    private static KontoBankowe utworzKontoBankowe() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Podaj numer konta: ");
//        long numerKonta = scanner.nextLong();
//        System.out.println("Podaj stan konta: ");
//        int stanKonta = scanner.nextInt();
//
////        numerKonta(numerKonta,stanKonta)
//        return new KontoBankowe(numerKonta, stanKonta);
//    }
//
//    void wyswietlStanKonta(){
//        System.out.println("Stan konta: "+stanKonta);
//    }
//    void wplacSrodki(int kwota){
//        stanKonta+=kwota;
//    }
//    int pobierzSrodki(int kwota){
//        if(kwota>stanKonta){
//            return 0;
//        }
//        stanKonta-=kwota;
//        return kwota;
//
//    }
//}
