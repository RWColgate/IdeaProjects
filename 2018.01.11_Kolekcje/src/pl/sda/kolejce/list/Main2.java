package pl.sda.kolejce.list;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> slowa = new ArrayList<>();
        slowa.add("Rycerz");
        slowa.add("Ala");
        slowa.add("Kot");
        slowa.add("Ala");
        System.out.println(slowa);
        wyswietlDuplikaty(slowa);
        usunDuplikaty(slowa);
        System.out.println("Bez duplikatow");
        System.out.println(slowa);
    }

    private static void usunDuplikaty(List<String> slowa) {
        List<String> duplikaty = pobierzDuplikaty(slowa);
        List<Integer> indeksyDuplikatow = new ArrayList<>();
        for (String duplikat:duplikaty){
            while (slowa.indexOf(duplikat)!=slowa.lastIndexOf(duplikat)){
                slowa.remove(duplikat);
            }
        }
    }

    private static void wyswietlDuplikaty(List<String> slowa) {
        List<String> duplikaty = pobierzDuplikaty(slowa);
        System.out.println(duplikaty);
    }

    private static List<String> pobierzDuplikaty(List<String> slowa) {
        List<String> duplikaty = new ArrayList<>();
        for (String slowo:slowa){
            if (slowa.indexOf(slowo)!=slowa.lastIndexOf(slowo)){
                duplikaty.add(slowo);
            }
        }
        return duplikaty;
    }
}