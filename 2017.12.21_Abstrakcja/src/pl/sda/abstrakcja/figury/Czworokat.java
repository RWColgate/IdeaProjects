package pl.sda.abstrakcja.figury;

public abstract class Czworokat extends Wielokat{
    public Czworokat(double a, double b, double c, double d) {
        super(new double[]{a,b,c,d});
        //w  przypadku konstruktora super musi byc pierwsze
    }

}
