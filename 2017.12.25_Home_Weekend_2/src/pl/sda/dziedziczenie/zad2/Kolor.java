package pl.sda.dziedziczenie.zad2;

public enum Kolor {
    KIER((char)'\u2764'),
    KARO((char)'\u2663'),
    TREFL((char)'\u2764'),//BLAD
    PIK((char)'\u2660');


    char znaczek;

    Kolor(char znaczek) {
        this.znaczek = znaczek;
    }
}
