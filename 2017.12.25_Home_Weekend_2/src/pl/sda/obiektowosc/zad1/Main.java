package pl.sda.obiektowosc.zad1;

public class Main {
    public static void main(String[] args) {
        Samochod samochod = new Samochod("czerwony", "BMW", 1996);
        SzybkiSamochod szybkisamochod = new SzybkiSamochod("czerwony", "BMW", 1996);

        System.out.println(samochod.equals(szybkisamochod));
        System.out.println(szybkisamochod.equals(samochod));

        // jak klikniecie lewym klawiszem z contrl na metode equals - przeniesie
        // was do nadpisanych metod w tatmych plikach


        samochod.przyspiesz();
        szybkisamochod.przyspiesz();

        System.out.println(samochod.toString());
        System.out.println(szybkisamochod.toString());
    }


}
