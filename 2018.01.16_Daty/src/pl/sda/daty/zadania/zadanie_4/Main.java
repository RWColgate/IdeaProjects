package pl.sda.daty.zadania.zadanie_4;

import com.sun.javafx.binding.StringFormatter;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy mm dd");
        String data1 = "1943-04-29";
        String data2 = "1980-05-13";
        LocalDate data11 = LocalDate.parse(data1);
        LocalDate data22 = LocalDate.parse(data2);
        int ileDni = Period.between(data11, data22).getDays();
        int ileMiesiecy = Period.between(data11, data22).getMonths();
        int ileLat = Period.between(data11, data22).getYears();
        System.out.printf("Minelo %d lat %d miesiecy i %d dni", ileLat, ileMiesiecy, ileDni);
    }
}
