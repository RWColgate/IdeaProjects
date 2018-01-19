package pl.sda.kolejce.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //przy kolekcjach nie mozna uzywac typow prymitywnych
        List<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(2);
        lista.add(3);
        System.out.println(lista);
        lista.addAll(lista);
        System.out.println(lista);
        wyswietlElementyOParzystemIndeksie(lista);
        wyswietlParzysteElementy(lista);
        Collections.sort(lista);

    }

    private static void wyswietlElementyOParzystemIndeksie(List<Integer> lista) {
        System.out.print("wyswietlElementyOParzystemIndeksie [");
        for(int i=0; i<lista.size();i++){
            if(i%2==0){
                System.out.print(lista.get(i));
            }
        }
        System.out.print("]\n");
    }

    private static void wyswietlParzysteElementy(List<Integer> lista) {
        System.out.print("wyswietlParzysteElementy [");
        for(Integer element:lista){
            if(element%2==0){
                System.out.print(element+" ");
            }
        }
        System.out.print("]\n");
    }
}
