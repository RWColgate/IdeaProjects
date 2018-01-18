package pl.sda.zadania.zadanie_21;

import java.util.ArrayList;
import java.util.List;

public class Town {
    List<Citizen> citizenList = new ArrayList<>();

    public void howManyCanVote(){
        int ile = 0;
        for (Citizen citizen:citizenList){
            if(citizen.canVote()==true){
                ile++;
            }
        }
        System.out.printf("Moze glosowac %d osob",ile);
    }

    public void whoCanVote(){
        for(Citizen citizen: citizenList){
            if(citizen.canVote()==true){
                System.out.println(citizen);
            }
        }
    }
}
