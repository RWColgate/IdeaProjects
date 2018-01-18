package pl.sda.abstrakcja.figury;

public class Main {
    public static void main(String[] args) {
        Okrag okrag = new Okrag(3);
        System.out.println(okrag.obliczObwod());
        System.out.println(okrag.obliczPole());
    }
}
