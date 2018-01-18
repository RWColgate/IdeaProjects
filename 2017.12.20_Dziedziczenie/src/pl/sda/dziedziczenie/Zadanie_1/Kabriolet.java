package pl.sda.dziedziczenie.Zadanie_1;

import java.util.Scanner;

public class Kabriolet extends Samochod {
    private String dachCzySchowany = "schowany";

    public Kabriolet(int predkoscJazdy, String swiatlo, String dachCzySchowany) {
        super(predkoscJazdy, swiatlo);
        this.dachCzySchowany = dachCzySchowany;
    }

//    @Override
    public void przyspiesz() {
        int predkosc = getPredkoscJazdy();
        long current = System.currentTimeMillis();
        while(predkosc<180){
            if(System.currentTimeMillis() - current > 1000){
                predkosc+=10;
                current = System.currentTimeMillis();
                System.out.printf("Przyspieszam do %d km/h\n",predkosc);
            }
        }
    }

    protected void schowajDach() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Twoj dach jest %s czy chcesz go ", dachCzySchowany);
        if (dachCzySchowany.equalsIgnoreCase("schowany")) System.out.println("odkryc?");
        else if (dachCzySchowany.equalsIgnoreCase("odkryty")) System.out.println("schowac?");
        dachCzySchowany = scanner.nextLine();
    }

    protected boolean czyDachSchowany() {
        if (dachCzySchowany.equalsIgnoreCase("tak chce go odkryc") || dachCzySchowany.equalsIgnoreCase("nie, nie bedzie odkryty")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Kabriolet kabrio = new Kabriolet(40, "wlaczone", "schowany");

        System.currentTimeMillis();
        wywolanieJechania(kabrio);
        kabrio.przyspiesz();

    }

    static void wywolanieJechania(Kabriolet kabrio) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak szybko teraz jedziesz?");
        int jakSzybko = scanner.nextInt();
        kabrio.setPredkoscJazdy(jakSzybko);

    }
}
