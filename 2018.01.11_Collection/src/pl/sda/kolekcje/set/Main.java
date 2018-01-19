package pl.sda.kolekcje.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> imiona = new TreeSet<>();//wypisuje alfabetycznie
//        Set<String> imiona = new HashSet<>();// wypisuje randomowp
//        Set<String> imiona = new LinkedHashSet<>();//wypisuje tak jak wpisalismy

        imiona.add("Ala");
        imiona.add("Ala");
        imiona.add("Piotr");
        imiona.add("Bogdan");
        imiona.add("Stefan");
        imiona.add("Marianna");

        System.out.println(imiona);

        for(String imie:imiona){
            System.out.print(imie + " ");
//            imie.replaceFirst(imie);
        }

        Iterator iterator = imiona.iterator();
        while(iterator.hasNext()){
//            System.out.print("\n" + iterator.next()+ " ");
//            imiona.remove(iterator.next());
        }
        System.out.println(imiona);
    }
}
