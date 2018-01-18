package pl.sda.interfejsy.zadanie3;

import java.util.regex.Pattern;

public class Weganin implements Jedzacy{

    private  Pokarm[] wszamane = new Pokarm[5];
    private int ileZjadl = 0;

    @Override
    public void jedz(Pokarm pokarm) {
        if(ileZjadl==wszamane.length){
            System.out.printf("Jestem najedzony %d posilkow to moj limit\n", ileZjadl);
        }
        else if(pokarm.getTypPokarmu().equals(TypPokarmu.MIESO)){

            System.out.printf("To oburzajace podawac mi %s, nie jadam %s.", pokarm.getNazwa(), pokarm.getTypPokarmu().toString().toLowerCase());
        }
        else {
            System.out.printf("Dziekuje za smaczne %s.\n", pokarm.getNazwa());
            ileZjadl++;
        }
    }
    @Override
    public int ilePosilkowZjedzone() {
        int suma=0;
        for(Pokarm pokarm:wszamane){
            if(pokarm!=null){
                suma+=ileZjadl;
            }
        }
        return 0;
    }

    @Override
    public int ileGramowZjedzone() {
        int suma = 0;
        for (Pokarm pokarm:wszamane){
            if(pokarm!=null){
                suma+= pokarm.pobierzWage();
            }
        }
        return 0;
    }
}
