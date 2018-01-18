package pl.sda.interfejsy.zadanie4;

public interface Chlodzi {
    double pobierzTemp();

    void schlodz();

    default void wyswietlTemp() {
        System.out.printf("Temperatura wynosi %.1f stopni\n", this.pobierzTemp());
    }
}
