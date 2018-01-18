package pl.sda.abstrakcja.figury;

public class Prostokat extends Czworokat {
    private final double a;
    private final double b;

    public Prostokat(double a, double b) {
        super(a, b, a, b);
        this.a = a;
        this.b = b;
    }

    public double obliczPole() {
        return a * b;
    }
}
