package pl.sda.abstrakcja.figury;

public abstract class Wielokat extends Figura{
    private double[] boki;

    public Wielokat(double[] boki) {
        this.boki = boki;
    }

    public double obliczObwod() {
        double obwod=0;
        for(int i=0; i<boki.length; i++){
            obwod+=boki[i];
        }
    return obwod;
    }
}
