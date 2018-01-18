package ZliczaczKaloriezad3;

public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        Marchewka marchew = new Marchewka();
        PodwojnyWooper burger = new PodwojnyWooper();
        Pizza pizza = new Pizza();

        kalkulator.dodajPokarm(marchew, 3);
        kalkulator.dodajPokarm(pizza,2);
        kalkulator.dodajPokarm(burger,5);

        kalkulator.wypisz();
        // dlatego bo new bo zeby dodac marchewki trzba zrobic ten obiekt
    }
}
