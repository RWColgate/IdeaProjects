package pl.sda.interfejsy.zadanie4;

public interface Grzeje {
    double pobierzTemp();

    void zwiekszTemp();

    default void wyswietlTemp() {
        System.out.printf("Temperatura wynosi %.1f stopni\n", this.pobierzTemp());
    }
}
