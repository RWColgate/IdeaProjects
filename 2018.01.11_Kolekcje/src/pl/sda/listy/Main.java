package pl.sda.listy;

import java.util.*;

public class Main {
    private static Random random = new Random();

    public static void main(String[] args) {
//        List<Integer> suma = new LinkedList<>();
//        dodajLiczbyDoListy(suma);
//        liczaceSumeLiczbNaLiscie(suma);
//        liczacySredniaLiczbNaLiscie(suma);
//        liczaceIloczynLiczbNaLiscie(suma);

//        List<Boolean> listaBooleanow = new LinkedList<>();
//        System.out.println(dodajWartosciLogiczneDoListy(listaBooleanow));
//        System.out.println(negujacaWartosciLogiczneListy(listaBooleanow));
//        System.out.println(koniunkcjaWartosciLogicznychListy(listaBooleanow));
//        System.out.println(alternatywaWartosciLogicznychListy(listaBooleanow));

//        List<User> userList = new LinkedList<>();
//        User user1 = new User("Tomasz","915043");
//        User user2 = new User("Romek","293543");
//        User user3 = new User("Tadek","5891834");
//        userList.add(user1);
//        userList.add(user2);
//        userList.add(user3);

//        tworzeListeITabliceDziesieciuElementow();

    }

    private static void tworzeListeITabliceDziesieciuElementow() {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(random.nextInt(20));
        }

        Integer[] tablica = new Integer[10];
        for (int i = 0; i < 10; i++) {
            tablica[i]=random.nextInt(20);
        }

}

    private static Boolean alternatywaWartosciLogicznychListy(List<Boolean> listaBooleanow) {
        Boolean pom = listaBooleanow.get(0);
        for (int i = 1; i < listaBooleanow.size(); i++) {
            pom = pom || listaBooleanow.get(i);
        }
        return pom;
    }

    private static Boolean koniunkcjaWartosciLogicznychListy(List<Boolean> listaBooleanow) {
        Boolean pom = listaBooleanow.get(0);
        for (int i = 1; i < listaBooleanow.size(); i++) {
            pom = pom && listaBooleanow.get(i);
        }
        return pom;
    }

    private static List<Boolean> negujacaWartosciLogiczneListy(List<Boolean> listaBooleanow) {

        for (int i = 0; i < listaBooleanow.size(); i++) {
//            boolean zmiennaTymczasowa = listaBooleanow.get(i);
            listaBooleanow.set(i, !listaBooleanow.get(i));
        }
        return listaBooleanow;
    }

    private static List<Boolean> dodajWartosciLogiczneDoListy(List<Boolean> listaBooleanow) {
        for (int i = 0; i < 10; i++) {
            listaBooleanow.add(i, random.nextBoolean());
        }
        return listaBooleanow;
    }

    private static List<Integer> dodajLiczbyDoListy(List<Integer> suma) {
        for (int i = 0; i < 10; i++) {
            suma.add(random.nextInt(50));
        }
        return suma;
    }

    private static void liczacySredniaLiczbNaLiscie(List<Integer> suma) {
        Integer wynik = 0;
        for (Integer integer : suma) {
            wynik += integer;
        }
        wynik /= suma.size();
        System.out.println("Srednia listy to: " + wynik);
    }

    private static void liczaceIloczynLiczbNaLiscie(List<Integer> suma) {
        Integer wynik = 1;
        for (Integer integer : suma) {
            wynik *= integer;
        }
        System.out.println("Iloczyn liczb listy to: " + wynik);
    }

    private static void liczaceSumeLiczbNaLiscie(List<Integer> suma) {
        Integer wynik = 0;
        for (Integer integer : suma) {
            wynik += integer;
        }
        System.out.println("Suma listy to: " + wynik);
    }
}
