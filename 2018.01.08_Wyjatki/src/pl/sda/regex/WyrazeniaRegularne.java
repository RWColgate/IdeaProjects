package pl.sda.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WyrazeniaRegularne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dwa teksty co chcesz zlaczyc: ");
        String wyraz1 = scanner.nextLine();
//        String wyraz2 = scanner.nextLine();

//        zlacz(wyraz1, wyraz2);
//        System.out.println(usuwanieSamoglosek(wyraz1));
//        System.out.println(zamianaDuzejLiteryNaZnaki(wyraz1, wyraz2));
//        usuwanieLiczbWIekszychOd();
        System.out.println(zamianaKoncaZdaniaIDodanieNowejLinii(wyraz1));
    }

    private static String zamianaKoncaZdaniaIDodanieNowejLinii(String tekst) {
        Pattern pattern = Pattern.compile("\\.\\s?[A-Z]");
        Matcher matcher = pattern.matcher(tekst);

        while (matcher.find()){
            String found = matcher.group();
            String zNowaLinia = found.replace("\\.", "\\.\n");
            tekst = tekst.replaceFirst(found, zNowaLinia);
        }

        return tekst;//replaceAll("\\.","\n");
    }

    private static void usuwanieLiczbWIekszychOd() {
//        Pattern pattern = Pattern.compile()

    }
    private static String zamianaDuzejLiteryNaZnaki(String tekst, String na) {
        return tekst.replaceAll("[A-Z][a-z]+", na);
    }

    private static String usuwanieSamoglosek(String wyraz) {
        return wyraz.replaceAll("a|e|i|o|u|y", "");
    }



    private static void zlacz(String wyraz1, String wyraz2) {
        wyraz1 = wyraz1.trim();
        wyraz2 = wyraz2.trim();
        String nowyWyraz = wyraz1.substring(2) + wyraz2.substring(0 + wyraz2.length() - 2);
        System.out.println(nowyWyraz);
    }

}