package pl.sda.daty.zadania.zadanie_5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swoj wiek w formacie yyyy-mm-dd");
        String palec = sc.nextLine();
        LocalDate dataPalca = LocalDate.parse(palec);
        LocalDate localDate = LocalDate.now();
        int wiek = Period.between(dataPalca,localDate).getYears();
        System.out.println("Twoj wiek: " + wiek);
    }
}
