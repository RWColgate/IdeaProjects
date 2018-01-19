package pl.sda.interfejsy.zadanie3;

public abstract class Zwierze implements Jedzacy {
    protected Pokarm[] zjedzone;
    protected int ileZjedzone;

    public Zwierze(int maxPosilkow) {
        this.zjedzone = new Pokarm[maxPosilkow];
    }


    public int ilePosilkowZjedzonych() {
        return this.ileZjedzone;
    }

    public int ileGramowJedzone() {
        int suma = 0;
        for (Pokarm pokarm : zjedzone) {
            if (pokarm != null) {
                suma += pokarm.pobierzWage();
            }
        }
        return suma;
    }
}