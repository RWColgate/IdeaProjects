package pl.sda.obiektowosc.zad6i7;

public class Plansza {
    Punkt punkt1;
    Punkt punkt2;

    public Plansza(Punkt punkt1, Punkt punkt2) {
        this.punkt1 = punkt1;
        this.punkt2 = punkt2;
    }

    public static double obliczOdleglosc(Punkt punkt1, Punkt punkt2){
        double x,y,wynik = 0;
        x = punkt2.getX()-punkt1.getX();
        y = punkt2.getY()-punkt1.getY();
        wynik = x*x + y*y;
        return Math.sqrt(wynik);
    }
}
