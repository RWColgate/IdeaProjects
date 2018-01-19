package pl.sda.zadanie1;

import javax.xml.soap.SAAJMetaFactory;

public class Main {
    public static void main(String[] args) {
        Samochod bmw = new BMW("S60","Zielony");
        Samochod porszak = new Porshe("a40", "Czerwony");
        Garaz<Samochod> garaz = new Garaz<>();

        porszak.zmienKolor("Ognisty");

        garaz.zaparkujAuto(porszak);
//        garaz.wyprowadzAuto(bmw);
        garaz.zaparkujAuto(bmw);
        garaz.zaparkujAuto(porszak);

    }
}
