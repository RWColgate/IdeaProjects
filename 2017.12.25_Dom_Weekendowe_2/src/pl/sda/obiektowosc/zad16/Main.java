package pl.sda.obiektowosc.zad16;

public class Main {
    public static void main(String[] args) {
        Czas czas = new Czas(15,32,0);
        System.out.println("Po dodaniu: " + czas.dodaj(czas));
        System.out.println("Po odjeciu: " + czas.odejmij(czas));
        System.out.println("Po wymnozeniu: " +czas.pomnoz(czas));
    }
}
