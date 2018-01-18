package pl.sda.daty.zadania.zadanie_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM DD");
        LocalDate localDate = LocalDate.now();
        localDate.format(formatter);
        int ile = sc.nextInt();
        System.out.println(localDate.plusDays(ile));
        System.out.println(localDate.minusDays(ile));
    }
}
