package pl.sda.obiektowosc.zad6i7;

public class Main {
    public static void main(String[] args) {
        Punkt punkt1 = new Punkt(1,1);
        Punkt punkt2 = new Punkt(2,2);
        Plansza plansza = new Plansza(punkt1, punkt2);
        System.out.println(plansza.obliczOdleglosc(punkt1,punkt2));
    }
}
