package pl.sda.daty.zadania.zadanie_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Data {
    private static final Random r = new Random();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYY MM DD HH:MM");
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("Program dziala.");
        boolean isWorking = true;
        do {
            System.out.println("Podaj komende: ");
            String command = sc.nextLine().trim().toLowerCase();
            String[] words = command.split(" ");

            if ("date".equals(words[0])) {
                System.out.println(localDate);
            } else if ("time".equals(words[0])) {
                System.out.println(localTime);
            } else if ("datetime".equals(words[0])) {
                System.out.println(localDateTime);
            } else if ("quit".equals(words[0])) {
                break;
            }
        }
        while (isWorking);
    }
}
