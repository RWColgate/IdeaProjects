package ZliczaczKaloriezad3;

import java.util.ArrayList;
import java.util.List;

public class Kalkulator {
    //jest wbudowana klasa list

    private List<Pokarm> pokarmy = new ArrayList<Pokarm>();
    private int totalKcal;

    public void dodajPokarm(Pokarm pokarm, int ileSztuk){
        for(int i=0 ;i<ileSztuk ; i++){
            pokarmy.add(pokarm);
        }
        totalKcal += ileSztuk * pokarm.getIleKcal();
    }

    public void wypisz(){

        for(Pokarm pokarm : pokarmy){
            System.out.println(pokarm);
        }
        System.out.printf("Calkowita liczba kalori = %d", totalKcal);
    }

}
