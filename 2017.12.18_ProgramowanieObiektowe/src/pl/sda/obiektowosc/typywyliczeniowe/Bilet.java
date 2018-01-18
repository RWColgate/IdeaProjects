package pl.sda.obiektowosc.typywyliczeniowe;

import java.util.Scanner;

public enum Bilet {
    ULGOWY_GODZINNY(3.5d, 60),
    ULGOWY_DOBOWY(6.5d, 60 * 24),
    NORMALNY_GODZINNY(5.2d, 60),
    NORMALNY_DOBOWY(13.30d, 60 * 24),
    BRAK_BILETU(0.0d, 0);
    double cena;
    int minuty;

    Bilet(double cena, int minuty) {
        this.cena = cena;
        this.minuty = minuty;
    }

    public double pobierzCeneBiletu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile mozesz max wydac na bilet");
        cena=scanner.nextInt();
        return cena;
    }

    public double pobierzCzasJazdy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile bedziesz max jechac");
        minuty=scanner.nextInt();
        return minuty;
    }

    public void wyswietlDaneOBilecie() {
        System.out.println("Bilet " + this.toString().toLowerCase().replace("_", " ") + " kosztuje " + this.cena + " i pozwala na jezdzenie przez " +  this.minuty +" minut");
    }

    public static void main(String[] args) {
        Bilet pierwszy = Bilet.ULGOWY_GODZINNY;
        Bilet drugi = Bilet.NORMALNY_DOBOWY;
        Bilet trzeci = Bilet.ULGOWY_DOBOWY;
        Bilet czwarty = Bilet.BRAK_BILETU;
//        podajDane();
//        czwarty.pobierzCeneBiletu();
//        czwarty.pobierzCzasJazdy();
//        czwarty.wyswietlDaneOBilecie();
        for (Bilet bilet : Bilet.values()) {
            bilet.wyswietlDaneOBilecie();
        }

    }

    public static void odpowiedniBilet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoj wiek: ");
        int ileLat = scanner.nextInt();
        System.out.println("Podaj ile chcesz jechac: ");
        int ileJedziesz = scanner.nextInt();
        System.out.println("Podaj ile masz kasy: ");
        double ileMaszKasy = scanner.nextInt();

        if (ileLat >= 18) {
            if (ileJedziesz <= 60) {
                if (ileMaszKasy >= 3.5d) {
                    ULGOWY_GODZINNY.wyswietlDaneOBilecie();
                }
            } else {
                if (ileMaszKasy >= 6.5d) {
                    ULGOWY_DOBOWY.wyswietlDaneOBilecie();
                }
            }
        } else if (ileLat < 18) {
            if (ileJedziesz <= 60) {
                if (ileMaszKasy >= 3.5d) {
                    NORMALNY_GODZINNY.wyswietlDaneOBilecie();
                }
            } else {
                if (ileMaszKasy >= 6.5d) {
                    NORMALNY_DOBOWY.wyswietlDaneOBilecie();
                }
            }
        } else BRAK_BILETU.wyswietlDaneOBilecie();
    }
}
