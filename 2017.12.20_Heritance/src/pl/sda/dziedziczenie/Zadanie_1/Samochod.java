package pl.sda.dziedziczenie.Zadanie_1;

import java.util.Scanner;

public class Samochod {
    private int predkoscJazdy;
    private String swiatlo;

    public Samochod(int predkoscJazdy, String swiatlo) {
        this.predkoscJazdy = predkoscJazdy;
        this.swiatlo = swiatlo;
    }

    public int getPredkoscJazdy() {
        return predkoscJazdy;
    }

    public String getSwiatlo() {
        return swiatlo;
    }

    public void setPredkoscJazdy(int predkoscJazdy) {
        this.predkoscJazdy = predkoscJazdy;
    }

    public void setSwiatlo(String swiatlo) {
        this.swiatlo = swiatlo;
    }

    public void przyspiesz() {
        if (predkoscJazdy < 120) predkoscJazdy += 10;
        System.out.printf("Przyspieszam do %d km/h.\n", predkoscJazdy);
    }

    protected void wlaczSwiatlo() {
        System.out.printf("Teraz swiatlo jest %s, czy chcesz je ", swiatlo);
        if (swiatlo.equalsIgnoreCase("wlaczone")) System.out.println("wylaczyc?");
        else System.out.println("wlaczyc?");
        Scanner scanner = new Scanner(System.in);
        swiatlo = scanner.nextLine();
    }

    protected boolean czySwiatloWlaczone() {
        boolean stanSwiatla;
        if (swiatlo.equalsIgnoreCase("wlaczone")
                || swiatlo.equalsIgnoreCase("wlaczyc")) stanSwiatla = true;
        else stanSwiatla = false;
        return stanSwiatla;
    }

    public static void main(String[] args) {
        Samochod audi = new Samochod(90, "wlaczone");
        audi.przyspiesz();
        audi.wlaczSwiatlo();
        System.out.println(audi.czySwiatloWlaczone());
    }
}

