package pl.sda.interfejsy.zadanie4;

public class Klimatyzacja implements Grzeje, Chlodzi {
    @Override
    public double pobierzTemp() {
        return 10;
    }

    @Override
    public void schlodz() {
        double temperatura = this.pobierzTemp() - 10;
        System.out.println("Zwiekszona temperatura to: " + temperatura);
    }

    @Override
    public void zwiekszTemp() {
        double temperatura = this.pobierzTemp() + 10;
        System.out.println("Zwiekszona temperatura to: " + temperatura);

    }

    @Override
    public void wyswietlTemp() {Chlodzi.super.wyswietlTemp();}
}