package pl.sda.obiektowosc.zad14;

public class Main {
    public static void main(String[] args) {
        Pozycja pozycja1 = new Pozycja("Chleb", 2, 4.00);
        Pozycja pozycja2 = new Pozycja("Banany", 1, 6.00);
        Pozycja[] pozycjaTab = new Pozycja[]{pozycja1, pozycja2};

        Zamowienie zamowienie = new Zamowienie(2);

    }
}
