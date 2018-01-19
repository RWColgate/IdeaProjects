package pl.sda.abstrakcja.figury;

public class Okrag extends Figura{
    private final double PI = 3.14;
    private final double r;

    public Okrag(double promien) {
        this.r = promien;
    }

    public double obliczObwod() {
        return 2*PI*r;
    }

    public double obliczPole() {
        return PI*r*r;
    }




}
