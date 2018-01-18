package pl.sda.zadanie1;

public class Samochod {
    private String marka;
    private String model;
    private String kolor;

    public Samochod(String marka, String model, String kolor) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
    }

    public String getMarka() {
        return marka;
    }

    @Override
    public String toString() {
        return "Samochod{" +"marka='" + marka + '\'' +", model='" + model + '\'' +", kolor='" + kolor + '\'' +'}';
    }
    public void zmienKolor(String kolor){
        this.kolor = kolor;
    }
}
