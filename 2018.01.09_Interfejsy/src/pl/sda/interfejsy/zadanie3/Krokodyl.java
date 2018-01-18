package pl.sda.interfejsy.zadanie3;

public class Krokodyl implements Jedzacy {
    private Pokarm[] ileWszamane = new Pokarm[20];
    private int ileZjedzone = 0;
    private final int MAX_WAGA_POSILKU = 50000;

    @Override
    public void jedz(Pokarm pokarm) {
        if(pokarm.pobierzWage()>MAX_WAGA_POSILKU){
            System.out.println("ROAR NIOM NIOM");
            return;
        }
        ileWszamane[ileZjedzone] = pokarm;
        ileZjedzone++;
    }

    @Override
    public int ilePosilkowZjedzone() {
        return ileZjedzone;
    }

    @Override
    public int ileGramowZjedzone() {
        int suma =0;
        for( Pokarm pokarm: ileWszamane){
            if(pokarm!=null){
                suma+=pokarm.pobierzWage();
            }
        }
        return suma;
    }
}
