package pl.sda.daty.zadania.zadanie_moje_1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy mm dd");
        LocalDate localDate = LocalDate.now();
        String data1 = "1990-05-09";
        String data2 = "1970-04-23";
        LocalDate data90 = LocalDate.parse(data1);
        LocalDate data80 = LocalDate.parse(data2);
        int roznicaDat = Period.between(data90,data80).getDays();
        System.out.printf("Teraz jest %s\n",localDate);
        System.out.printf("Teraz jest %s\n",data1);
        System.out.printf("Teraz jest %s\n",data90);

    }
}
