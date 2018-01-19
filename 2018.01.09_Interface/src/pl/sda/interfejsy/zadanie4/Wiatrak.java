package pl.sda.interfejsy.zadanie4;

public class Wiatrak implements Chlodzi {
    @Override
    public double pobierzTemp() {
        return 10;
    }

    @Override
    public void schlodz() {
        double temperatura = pobierzTemp() - 10;
        System.out.println("Zwiekszona temperatura to: " + temperatura);
    }
}
