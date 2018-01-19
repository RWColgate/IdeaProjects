package pl.sda.interfejsy.zadanie4;

public class Farelka implements Grzeje {
    @Override
    public double pobierzTemp() {
        return 10;
    }

    @Override
    public void zwiekszTemp() {
        double temperatura = pobierzTemp() + 10;
        System.out.println("Zwiekszona temperatura to: " + temperatura);
    }
}
