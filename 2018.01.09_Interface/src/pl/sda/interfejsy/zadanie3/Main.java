package pl.sda.interfejsy.zadanie3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Pokarm pokarm1 = new Pokarm("Kurczak", TypPokarmu.MIESO, 3);
        Pokarm pokarm2 = new Pokarm("Pizza", TypPokarmu.MIESO, 6);
        Pokarm pokarm3 = new Pokarm("Pierozki", TypPokarmu.MIESO, 5);
        Pokarm pokarm4 = new Pokarm("Jablko", TypPokarmu.OWOCE, 1);
        Pokarm pokarm5 = new Pokarm("Jogurcik", TypPokarmu.NABIAL, 1);
        Pokarm pokarm6 = new Pokarm("Jogurcik", TypPokarmu.NABIAL, 2);
        Pokarm pokarm7 = new Pokarm("Kefir", TypPokarmu.NABIAL, 2);
        Pokarm pokarm8 = new Pokarm("Gruszka", TypPokarmu.OWOCE, 1);

        Pokarm[] pokarms = {pokarm1,pokarm2,pokarm3,pokarm4,pokarm5,pokarm6,pokarm7,pokarm8};

        Krokodyl krokodyl = new Krokodyl();
        Weganin weganin = new Weganin();
        Programista programista = new Programista();

        weganin.jedz(pokarms[new Random().nextInt(pokarms.length)]);
        weganin.ileGramowZjedzone();
//        System.out.println(("Weganin zjadl " + weganin.ilePosilkowZjedzone());

    }
}
