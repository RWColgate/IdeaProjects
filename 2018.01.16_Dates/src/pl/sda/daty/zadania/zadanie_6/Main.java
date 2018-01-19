package pl.sda.daty.zadania.zadanie_6;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        Map<String, String> zoneIds = new HashMap<>();
        zoneIds.put("Warszawa", "Europe/Warsaw");
        zoneIds.put("Paryż", "Europe/Paris");
        zoneIds.put("Whitehorse", "Etc/UTC");
        zoneIds.put("Moskwa", "Europe/Moscow");
        zoneIds.put("Canberra", "Australia/Sydney");
        zoneIds.put("Sosnowiec", "Europe/Warsaw");
        Scanner scanner = new Scanner(System.in);

        String usersCity = scanner.nextLine();

        String timezone = zoneIds.get(usersCity);
        if (timezone == null) {
            System.out.println("R u srs");
            System.exit(666);
        } else {
            System.out.println(timezone);
            ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of(timezone)); //- data i czas dla Western European Time (WET)
            System.out.println(dateTime.format(formatter));
        }
    }
}
