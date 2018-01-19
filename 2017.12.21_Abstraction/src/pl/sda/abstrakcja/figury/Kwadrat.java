package pl.sda.abstrakcja.figury;

import java.util.Scanner;

public class Kwadrat extends Prostokat{
    public Kwadrat(double a) {
        super(a, a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Kwadrat kwadrat = new Kwadrat(30);
        Prostokat prostokat = new Prostokat(20,30);
        Okrag okrag = new Okrag(2);

        System.out.println(kwadrat.obliczObwod());
        System.out.println(kwadrat.obliczPole());

        Figura[] figury = new Figura[]{prostokat, okrag,okrag,kwadrat,kwadrat};
        System.out.println(SklepRomana.obliczIloscWiader(figury,200));
    }
//    private static void pobierzTablice() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Z ilu kwadratow sie sklada powierzchnia?");
//        int ileKwadratow = scanner.nextInt();
//        System.out.println("Z ilu trojkatow sklada sie nawierchnia?");
//        int ileTrojkatow = scanner.nextInt();
//        System.out.println("Z ilu okregow sklada sie nawierchnia");
//        int ileOkregow = scanner.nextInt();
//    }
}
